package dsm.deconhub.android.deconhub_android.loginsign

import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.icu.number.Scale.none
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.data.Login
import dsm.deconhub.android.deconhub_android.data.LoginService
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    var login: Login? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var retrofit = Retrofit.Builder()
            .baseUrl("http://ec2-54-180-109-55.ap-northeast-2.compute.amazonaws.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        var loginService: LoginService = retrofit.create(LoginService::class.java)

        loginButton.setOnClickListener {
            var id = accountId.text.toString()
            var pw = password.text.toString()

            loginService.requestLogin(id, pw).enqueue(object : Callback<Login> {
                override fun onFailure(call: Call<Login>, t: Throwable) {
                    Log.e("LOGIN", t.message.toString())
                    var dialog = AlertDialog.Builder(this@LoginActivity)
                    dialog.setTitle("에러")
                    dialog.setMessage("호출실패했습니다.")
                    dialog.show()
                }

                override fun onResponse(call: Call<Login>, response: Response<Login>) {
                    login = response.body()
                    Log.d("LOGIN", "msg : " + login?.accountId)
                    Log.d("LOGIN", "code : " + login?.password)
                    var dialog = AlertDialog.Builder(this@LoginActivity)
                    dialog.setTitle(login?.accountId)
                    dialog.setMessage(login?.password)
                    dialog.show()
                }
            })
        }

        signButton.setOnClickListener {
            val sign = Intent(this, SignActivity::class.java)
            startActivity(sign)
        }

        findPasswordButton.setOnClickListener {
            val findPassword = Intent(this, FindPasswordActivity::class.java)
            startActivity(findPassword)
        }
    }
}