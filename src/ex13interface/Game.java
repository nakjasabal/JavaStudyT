package ex13interface;

/*
Java에서는 하나의 Java파일에 하나의 public클래스만 선언할 수 있다. 
따라서 아무리 간단한 프로그램이라도 확장성을 위해 이와같이 만들어주는것이
좋다. public으로 선언하면 패키지에 상관없이 어디서든 접근할 수 있기
때문이다. */
public interface Game {
	int SCISSORS=1, ROCK=2, PAPER=3;
}