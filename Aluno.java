package ali.ernesto.manuel;

//Esta classe apresenta variáveis e métodos a serem usados na Caderneta 
//de modo a crair novos alunos(novos objectos) dependendo do número que o professr tiver na sua lista

public class Aluno {
	
private String nome;
private String Resultado;
private int idade;
private float nota1;
private float nota2;
private float media;


public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getResultado() {
	return Resultado;
}
public void setResultado(String resultado) {
	Resultado = resultado;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}

public float getNota1() {
	return nota1;
}
public void setNota1(float nota1) {
	this.nota1 = nota1;
}
public float getNota2() {
	return nota2;
}
public void setNota2(float nota2) {
	this.nota2 = nota2;
}
public float getMedia() {
	return media;
}
public void setMedia(float media) {
	this.media = media;
}




}
