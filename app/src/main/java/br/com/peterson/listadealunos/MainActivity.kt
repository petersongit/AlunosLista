package br.com.peterson.listadealunos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {
    var listAlunos = getAllAlunos()
    var adapter = AlunosAdapter(listAlunos)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAlunos.adapter = adapter
        rvAlunos.LayoutManager = LinearLayoutManager(this)
        rvAlunos.setHasFizxedSize(true)

    }

    //Retorna uma lista de alunos fixo
    fun getAllAlunos(): ArrayList<Aluno>{
        val aluno1 = Aluno(1, "Peterson", 7.0)
        val aluno2 = Aluno(2, "Mateus", 7.0)
        val aluno3 = Aluno(3, "Daniel", 7.0)

        //val listaAlunos = arrayListOf<Aluno>(aluno1, aluno2, aluno3)
        return arrayListOf<Aluno>(aluno1, aluno2, aluno3)

        /*return arrayListOf<Aluno>(Aluno(1, "Peterson", 7.0),
            Aluno(2, "Mateus", 7.0),
            Aluno(3, "Daniel", 7.0))*/


    }
}