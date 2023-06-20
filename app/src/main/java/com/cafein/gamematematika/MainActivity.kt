package com.cafein.gamematematika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {
    private var numbQuest = 0
    private var score = 0
    private var level = ""
    private var operationA = ""
    private var operationB = ""
    private lateinit var bgmHome: MediaPlayer
    private lateinit var bgmPlay: MediaPlayer
    private lateinit var bgmCorrect: MediaPlayer
    private lateinit var bgmWrong: MediaPlayer
    private lateinit var bgmGameOver: MediaPlayer
    private lateinit var layoutRoot: LinearLayout
    private lateinit var layoutHome: LinearLayout
    private lateinit var layoutMenu: LinearLayout
    private lateinit var gameLevel1: LinearLayout
    private lateinit var gameLevel2: LinearLayout
    private lateinit var gameLevel3: LinearLayout
    private lateinit var gameResult: LinearLayout
    private lateinit var solutionLv1: LinearLayout
    private lateinit var solutionLv2: LinearLayout
    private lateinit var solutionLv3: LinearLayout
    private lateinit var textNoLv1: TextView
    private lateinit var textNoLv2: TextView
    private lateinit var textNoLv3: TextView
    private lateinit var textScoreLv1: TextView
    private lateinit var textScoreLv2: TextView
    private lateinit var textScoreLv3: TextView
    private lateinit var textScoreResult: TextView
    private lateinit var textAlv1: TextView
    private lateinit var textBlv1: TextView
    private lateinit var textAlv2: TextView
    private lateinit var textBlv2: TextView
    private lateinit var textClv2: TextView
    private lateinit var textDlv2: TextView
    private lateinit var textAlv3: TextView
    private lateinit var textBlv3: TextView
    private lateinit var textClv3: TextView
    private lateinit var textDlv3: TextView
    private lateinit var textElv3: TextView
    private lateinit var textFlv3: TextView
    private lateinit var textOpAlv3: TextView
    private lateinit var textOpBlv3: TextView
    private lateinit var textOpClv3: TextView
    private lateinit var textOpDlv3: TextView
    private lateinit var textSolutionLv1: TextView
    private lateinit var textSolutionLv2: TextView
    private lateinit var textSolutionLv3: TextView
    private lateinit var btnStart: Button
    private lateinit var btnLv1: Button
    private lateinit var btnLv2: Button
    private lateinit var btnLv3: Button
    private lateinit var btnAnsGtLv1: Button
    private lateinit var btnAnsLtLv1: Button
    private lateinit var btnAnsEqLv1: Button
    private lateinit var btnAnsGtLv2: Button
    private lateinit var btnAnsLtLv2: Button
    private lateinit var btnAnsEqLv2: Button
    private lateinit var btnAnsGtLv3: Button
    private lateinit var btnAnsLtLv3: Button
    private lateinit var btnAnsEqLv3: Button
    private lateinit var btnNextQuestLv1: Button
    private lateinit var btnNextQuestLv2: Button
    private lateinit var btnNextQuestLv3: Button
    private lateinit var btnTryAgain: Button
    private lateinit var btnNext: Button

    private fun initComponents() {
        bgmHome = MediaPlayer.create(this, R.raw.bgm_home)
        bgmPlay = MediaPlayer.create(this, R.raw.bgm_play)
        bgmCorrect = MediaPlayer.create(this, R.raw.bgm_correct)
        bgmWrong = MediaPlayer.create(this, R.raw.bgm_wrong)
        bgmGameOver = MediaPlayer.create(this, R.raw.bgm_game_over)
        layoutRoot = findViewById(R.id.layoutRoot)
        layoutHome = findViewById(R.id.layoutHome)
        layoutMenu = findViewById(R.id.layoutMenu)
        gameLevel1 = findViewById(R.id.gameLevel1)
        gameLevel2 = findViewById(R.id.gameLevel2)
        gameLevel3 = findViewById(R.id.gameLevel3)
        gameResult = findViewById(R.id.gameResult)
        solutionLv1 = findViewById(R.id.solutionLv1)
        solutionLv2 = findViewById(R.id.solutionLv2)
        solutionLv3 = findViewById(R.id.solutionLv3)
        textNoLv1 = findViewById(R.id.textNoLv1)
        textNoLv2 = findViewById(R.id.textNoLv2)
        textNoLv3 = findViewById(R.id.textNoLv3)
        textScoreLv1 = findViewById(R.id.textScoreLv1)
        textScoreLv2 = findViewById(R.id.textScoreLv2)
        textScoreLv3 = findViewById(R.id.textScoreLv3)
        textScoreResult = findViewById(R.id.textScoreResult)
        textAlv1 = findViewById(R.id.textAlv1)
        textBlv1 = findViewById(R.id.textBlv1)
        textAlv2 = findViewById(R.id.textAlv2)
        textBlv2 = findViewById(R.id.textBlv2)
        textClv2 = findViewById(R.id.textClv2)
        textDlv2 = findViewById(R.id.textDlv2)
        textAlv3 = findViewById(R.id.textAlv3)
        textBlv3 = findViewById(R.id.textBlv3)
        textClv3 = findViewById(R.id.textClv3)
        textDlv3 = findViewById(R.id.textDlv3)
        textElv3 = findViewById(R.id.textElv3)
        textFlv3 = findViewById(R.id.textFlv3)
        textOpAlv3 = findViewById(R.id.textOpAlv3)
        textOpBlv3 = findViewById(R.id.textOpBlv3)
        textOpClv3 = findViewById(R.id.textOpClv3)
        textOpDlv3 = findViewById(R.id.textOpDlv3)
        textSolutionLv1 = findViewById(R.id.textSolutionLv1)
        textSolutionLv2 = findViewById(R.id.textSolutionLv2)
        textSolutionLv3 = findViewById(R.id.textSolutionLv3)
        btnStart = findViewById(R.id.btnStart)
        btnLv1 = findViewById(R.id.btnLv1)
        btnLv2 = findViewById(R.id.btnLv2)
        btnLv3 = findViewById(R.id.btnLv3)
        btnAnsGtLv1 = findViewById(R.id.btnAnsGtLv1)
        btnAnsLtLv1 = findViewById(R.id.btnAnsLtLv1)
        btnAnsEqLv1 = findViewById(R.id.btnAnsEqLv1)
        btnAnsGtLv2 = findViewById(R.id.btnAnsGtLv2)
        btnAnsLtLv2 = findViewById(R.id.btnAnsLtLv2)
        btnAnsEqLv2 = findViewById(R.id.btnAnsEqLv2)
        btnAnsGtLv3 = findViewById(R.id.btnAnsGtLv3)
        btnAnsLtLv3 = findViewById(R.id.btnAnsLtLv3)
        btnAnsEqLv3 = findViewById(R.id.btnAnsEqLv3)
        btnNextQuestLv1 = findViewById(R.id.btnNextQuestLv1)
        btnNextQuestLv2 = findViewById(R.id.btnNextQuestLv2)
        btnNextQuestLv3 = findViewById(R.id.btnNextQuestLv3)
        btnTryAgain = findViewById(R.id.btnTryAgain)
        btnNext = findViewById(R.id.btnNext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        initComponents()
        playBgmHome()

        btnStart.setOnClickListener { toMenu() }
        btnLv1.setOnClickListener { toPlay("1") }
        btnLv2.setOnClickListener { toPlay("2") }
        btnLv3.setOnClickListener { toPlay("3") }

        btnAnsGtLv1.setOnClickListener { isAnswer(">") }
        btnAnsLtLv1.setOnClickListener { isAnswer("<") }
        btnAnsEqLv1.setOnClickListener { isAnswer("=") }

        btnAnsGtLv2.setOnClickListener { isAnswer(">") }
        btnAnsLtLv2.setOnClickListener { isAnswer("<") }
        btnAnsEqLv2.setOnClickListener { isAnswer("=") }

        btnAnsGtLv3.setOnClickListener { isAnswer(">") }
        btnAnsLtLv3.setOnClickListener { isAnswer("<") }
        btnAnsEqLv3.setOnClickListener { isAnswer("=") }

        btnNextQuestLv1.setOnClickListener { nextQuest("1") }
        btnNextQuestLv2.setOnClickListener { nextQuest("2") }
        btnNextQuestLv3.setOnClickListener { nextQuest("3") }

        btnTryAgain.setOnClickListener { playAgain() }
        btnNext.setOnClickListener { toMenu() }
    }
    private fun toMenu() {
        layoutRoot.setBackgroundResource(R.drawable.bg_menu)
        layoutHome.visibility = View.GONE
        gameResult.visibility = View.GONE
        showMenu()
        stopBgmGameOver()
        stopBgmHome()
        playBgmHome()
    }
    private fun toPlay(lv: String) {
        layoutRoot.setBackgroundResource(R.drawable.bg_play)
        level = lv
        newGame()
        hideMenu()
        when (lv) {
            "1" -> gameLevel1.visibility = View.VISIBLE
            "2" -> gameLevel2.visibility = View.VISIBLE
            "3" -> gameLevel3.visibility = View.VISIBLE
        }
        quest(lv)
        stopBgmHome()
        playBgmPlay()
    }
    private fun newGame() {
        numbQuest = 1
        score = 0
        textNoLv1.text = "No $numbQuest."
        textNoLv2.text = "No $numbQuest."
        textNoLv3.text = "No $numbQuest."
        textScoreLv1.text = "Score : $score"
        textScoreLv2.text = "Score : $score"
        textScoreLv3.text = "Score : $score"
    }
    private fun playAgain() {
        if (level == "1") { toPlay("1") }
        if (level == "2") { toPlay("2") }
        if (level == "3") { toPlay("3") }
        stopBgmGameOver()
    }
    private fun quest(lv: String) {
        if (lv == "1") {
            textAlv1.text = Random.nextInt(1, 100).toString()
            textBlv1.text = Random.nextInt(1, 100).toString()
        }
        if (lv == "2") {
            textAlv2.text = Random.nextInt(1, 100).toString()
            textBlv2.text = Random.nextInt(1, 100).toString()
            textClv2.text = Random.nextInt(1, 100).toString()
            textDlv2.text = Random.nextInt(1, 100).toString()
        }
        if (lv == "3") {
            textAlv3.text = Random.nextInt(1, 100).toString()
            textBlv3.text = Random.nextInt(1, 100).toString()
            textClv3.text = Random.nextInt(1, 10).toString()
            textDlv3.text = Random.nextInt(1, 100).toString()
            textElv3.text = Random.nextInt(1, 100).toString()
            textFlv3.text = Random.nextInt(1, 10).toString()
            val opA = Random.nextInt(1, 10)
            val opB = Random.nextInt(1, 10)
            if (opA < 6) {
                operationA = "+"
                textOpAlv3.visibility = View.VISIBLE
                textOpBlv3.visibility = View.GONE
            } else {
                operationA = "-"
                textOpAlv3.visibility = View.GONE
                textOpBlv3.visibility = View.VISIBLE
            }
            if (opB < 6) {
                operationB = "+"
                textOpClv3.visibility = View.VISIBLE
                textOpDlv3.visibility = View.GONE
            } else {
                operationB = "-"
                textOpClv3.visibility = View.GONE
                textOpDlv3.visibility = View.VISIBLE
            }
        }
    }
    private fun isAnswer(answer: String) {
        var isAnswer = false
        when (level) {
            "1" -> if (textSolutionLv1.text != "") { isAnswer = true }
            "2" -> if (textSolutionLv2.text != "") { isAnswer = true }
            "3" -> if (textSolutionLv3.text != "") { isAnswer = true }
        }
        if (isAnswer) {
            Toast.makeText(this, "Soal sudah dijawab, silahkan klik tombol Next", Toast.LENGTH_SHORT).show()
        } else {
            checkAnswer(answer)
        }
    }
    private fun checkAnswer(answer: String) {
        var a = 0.0
        var b = 0.0

        if (level == "1") {
            a = textAlv1.text.toString().toDouble()
            b = textBlv1.text.toString().toDouble()
        }
        if (level == "2") {
            a = textAlv2.text.toString().toDouble() / textBlv2.text.toString().toDouble()
            b = textClv2.text.toString().toDouble() / textDlv2.text.toString().toDouble()
        }
        if (level == "3") {
            a = if (operationA == "+") {
                (textAlv3.text.toString().toDouble() / textBlv3.text.toString().toDouble()) + textClv3.text.toString().toDouble()
            } else {
                (textAlv3.text.toString().toDouble() / textBlv3.text.toString().toDouble()) - textClv3.text.toString().toDouble()
            }

            b = if (operationB == "+") {
                (textDlv3.text.toString().toDouble() / textElv3.text.toString().toDouble()) + textFlv3.text.toString().toDouble()
            } else {
                (textDlv3.text.toString().toDouble() / textElv3.text.toString().toDouble()) - textFlv3.text.toString().toDouble()
            }
        }

        if (answer == ">") {
            if (a > b) { correctAnswer(answer, a, b) }
            else { wrongAnswer(answer, a, b) }
        }
        if (answer == "<") {
            if (a < b) { correctAnswer(answer, a, b) }
            else { wrongAnswer(answer, a, b) }
        }
        if (answer == "=") {
            if (a == b) { correctAnswer(answer, a, b) }
            else { wrongAnswer(answer, a, b) }
        }
        showSolution()
    }
    private fun nextQuest(lv: String) {
        if (numbQuest < 5) {
            numbQuest++
            when (lv) {
                "1" -> textNoLv1.text = "No $numbQuest."
                "2" -> textNoLv2.text = "No $numbQuest."
                "3" -> textNoLv3.text = "No $numbQuest."
            }
            quest(lv)
        } else {
            showResult()
        }
        hideSolution()
        clearAnswer()
        stopBgmCorrect()
        stopBgmWrong()
    }
    private fun correctAnswer(answer: String, a: Double, b: Double) {
        Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show()
        score += 20
        when (level) {
            "1" -> textScoreLv1.text = "Score : $score"
            "2" -> textScoreLv2.text = "Score : $score"
            "3" -> textScoreLv3.text = "Score : $score"
        }
        isIntAns(answer, a, b)
        playBgmCorrect()
    }
    private fun wrongAnswer(answer: String, a: Double, b: Double) {
        Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
        when (answer) {
            ">" -> answerNotGt(a, b)
            "<" -> answerNotLt(a, b)
            "=" -> answerNotEq(a, b)
        }
        playBgmWrong()
    }
    private fun answerNotGt(a: Double, b: Double) {
        var correctAnswer = ""
        correctAnswer = if (a < b) { "<" } else { "=" }
        isIntAns(correctAnswer, a, b)
    }
    private fun answerNotLt(a: Double, b: Double) {
        var correctAnswer = ""
        correctAnswer = if (a > b) { ">" } else { "=" }
        isIntAns(correctAnswer, a, b)
    }
    private fun answerNotEq(a: Double, b: Double) {
        var correctAnswer = ""
        correctAnswer = if (a < b) { "<" } else { ">" }
        isIntAns(correctAnswer, a, b)
    }
    private fun isIntAns(answer: String, a: Double, b: Double) {
        var textA = ""
        var textB = ""
        val intA = a.toInt()
        val intB = b.toInt()
        textA = if (a - intA.toDouble() == 0.0) { "$intA" } else { String.format("%.2f", a) }
        textB = if (b - intB.toDouble() == 0.0) { "$intB" } else { String.format("%.2f", b) }
        textCorrectAnswer("$textA $answer $textB")
    }
    private fun textCorrectAnswer(answer: String) {
        when (level) {
            "1" -> textSolutionLv1.text = answer
            "2" -> textSolutionLv2.text = answer
            "3" -> textSolutionLv3.text = answer
        }
    }
    private fun clearAnswer() {
        when (level) {
            "1" -> textSolutionLv1.text = ""
            "2" -> textSolutionLv2.text = ""
            "3" -> textSolutionLv3.text = ""
        }
    }
    private fun showMenu() {
        layoutMenu.visibility = View.VISIBLE
    }
    private fun showSolution() {
        when (level) {
            "1" -> solutionLv1.visibility = View.VISIBLE
            "2" -> solutionLv2.visibility = View.VISIBLE
            "3" -> solutionLv3.visibility = View.VISIBLE
        }
    }
    private fun showResult() {
        layoutRoot.setBackgroundResource(R.drawable.bg_result)
        Toast.makeText(this, " -Game Over- ", Toast.LENGTH_SHORT).show()
        hideGame()
        gameResult.visibility = View.VISIBLE
        textScoreResult.text = "$score"
        stopBgmPlay()
        playBgmGameOver()
    }
    private fun hideMenu() {
        layoutMenu.visibility = View.GONE
    }
    private fun hideSolution() {
        when (level) {
            "1" -> solutionLv1.visibility = View.GONE
            "2" -> solutionLv2.visibility = View.GONE
            "3" -> solutionLv3.visibility = View.GONE
        }
    }
    private fun hideGame() {
        when (level) {
            "1" -> gameLevel1.visibility = View.GONE
            "2" -> gameLevel2.visibility = View.GONE
            "3" -> gameLevel3.visibility = View.GONE
        }
    }
    private fun playBgmHome() {
        bgmHome.start()
    }
    private fun playBgmPlay() {
        bgmPlay.start()
    }
    private fun playBgmCorrect() {
        bgmCorrect.start()
    }
    private fun playBgmWrong() {
        bgmWrong.start()
    }
    private fun playBgmGameOver() {
        bgmGameOver.start()
    }
    private fun stopBgmHome() {
        bgmHome.stop()
        bgmHome.prepare()
    }
    private fun stopBgmPlay() {
        bgmPlay.stop()
        bgmPlay.prepare()
    }
    private fun stopBgmCorrect() {
        bgmCorrect.stop()
        bgmCorrect.prepare()
    }
    private fun stopBgmWrong() {
        bgmWrong.stop()
        bgmWrong.prepare()
    }
    private fun stopBgmGameOver() {
        bgmGameOver.stop()
        bgmGameOver.prepare()
    }
}