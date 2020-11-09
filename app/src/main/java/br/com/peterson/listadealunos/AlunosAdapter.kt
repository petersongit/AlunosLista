package br.com.peterson.listadealunos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlunosAdapter(private val listaAlunos: ArrayList<Aluno>) : RecyclerView.Adapter<AlunosAdapter.AlunosViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AlunosAdapter.AlunosViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_aluno, parent, false)
        return AlunosViewHolder(itemView)
    }

    override fun getItemCount() = listaAlunos.size

    override fun onBindViewHolder(holder: AlunosAdapter.AlunosViewHolder, position: Int) {
        var aluno: Aluno = listaAlunos.get(position)
        holder.tvNomeAluno.text = aluno.nome
    }

    interface OnClickAlunoListener{
        fun onClickAluno(position: Int)
    }

    class AlunosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var tvNomeAluno: TextView = itemView.findViewById(R.id.tvNomeAluno)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(position: Int) {
            val position: int = adapterPosition;

            if (position != RecyclerView.NO_POSITION){
                
            }
        }

    }
}