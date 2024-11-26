package com.maximaseguranca.bank.model;

public class User {
    private Long id;
    private String nome;
    private int idade;
    private String cpf;
    private String numeroconta;
    private double saldo;

    public User(String nome, int idade, String cpf, String numeroconta) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numeroconta = numeroconta;
        this.saldo = 0.0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
