package com.mycompany.primeiroenum;

/**
 *
 * @author kauah
 */
public enum StatusAlunoENUM {

    MATRICULADO("Matriculado"),
    PENDENTE("Matricula Pendente"),
    CANCELADO("Matricula Cancelada"),
    PENDENCIA_FINANCEIRA("Aluno possuí pendencia financeira."
            + "Verificar com a tesouraria."),;

    private StatusAlunoENUM(String dsEnum) {
        this.dsEnum = dsEnum;
    }
    private String dsEnum;

    public String getDsEnum() {
        return dsEnum;
    }

}
