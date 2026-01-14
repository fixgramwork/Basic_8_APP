package com.haeyul.bts_picture_app

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val appName = findViewById<View>(R.id.appName)
        val dot1 = findViewById<View>(R.id.dot1)
        val dot2 = findViewById<View>(R.id.dot2)
        val dot3 = findViewById<View>(R.id.dot3)

        // 앱 이름 페이드인 애니메이션
        appName.alpha = 0f
        appName.animate()
            .alpha(1f)
            .setDuration(800)
            .start()

        // 점 애니메이션 시작
        startDotAnimation(dot1, 0)
        startDotAnimation(dot2, 200)
        startDotAnimation(dot3, 400)

        // 2초 후 MainActivity로 이동
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 2000)
    }

    private fun startDotAnimation(dot: View, delay: Long) {
        // 위로 올라가는 애니메이션
        val moveUp = ObjectAnimator.ofFloat(dot, "translationY", 0f, -30f).apply {
            duration = 500
            interpolator = AccelerateDecelerateInterpolator()
        }

        // 아래로 내려오는 애니메이션
        val moveDown = ObjectAnimator.ofFloat(dot, "translationY", -30f, 0f).apply {
            duration = 500
            interpolator = AccelerateDecelerateInterpolator()
        }

        // 애니메이션 세트
        val animatorSet = AnimatorSet().apply {
            playSequentially(moveUp, moveDown)
            startDelay = delay
        }

        // 무한 반복
        animatorSet.start()
        animatorSet.addListener(object : android.animation.Animator.AnimatorListener {
            override fun onAnimationStart(animation: android.animation.Animator) {}
            override fun onAnimationEnd(animation: android.animation.Animator) {
                animatorSet.start() // 애니메이션 반복
            }
            override fun onAnimationCancel(animation: android.animation.Animator) {}
            override fun onAnimationRepeat(animation: android.animation.Animator) {}
        })
    }
}