package com.mycompany.primeiroenum;

import java.util.Date;

/**
 *
 * @author kauah
 */
public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setDtMatricula(new Date());
        aluno.setId(10);
        aluno.setNome("Kauã");
        aluno.setRegistroAcademico("00225419");
        aluno.setStatusAluno(StatusAlunoENUM.MATRICULADO);

        System.out.println(aluno.toString());

    }

}
