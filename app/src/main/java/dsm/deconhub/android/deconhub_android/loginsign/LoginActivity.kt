package dsm.deconhub.android.deconhub_android.loginsign

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dsm.deconhub.android.deconhub_android.MainActivity
import dsm.deconhub.android.deconhub_android.R
import dsm.deconhub.android.deconhub_android.data.RequestLogin
import dsm.deconhub.android.deconhub_android.data.RequestToServer
import dsm.deconhub.android.deconhub_android.data.ResponseLogin
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val requestToServer = RequestToServer

        loginButton.setOnClickListener {
            Log.d(
                "id, pw",
                "\nid ${accountIdLogin.text.toString()} \npw ${passwordLogin.text.toString()}"
            )
            requestToServer.service.requestLogin(
                RequestLogin(accountIdLogin.text.toString(), passwordLogin.text.toString())
            ).enqueue(object : Callback<ResponseLogin> {
                override fun onFailure(call: Call<ResponseLogin>, t: Throwable) {
                    Log.d("통신 실패", "${t.message}")
                }

                override fun onResponse(
                    call: Call<ResponseLogin>,
                    response: Response<ResponseLogin>
                ) {
                    if (response.isSuccessful) {
                        Log.d("성공", response.body()!!.data.toString())
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java));
                        finish()

                    } else {
                        Log.d("실패", "실패")
                        Toast.makeText(
                            this@LoginActivity,
                            "아이디와 비밀번호를 확인해주세요.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
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