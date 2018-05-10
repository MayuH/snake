package snakecamel;

public class Main {
	public static void main(String[] args){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		System.out.println(snake.capitalize(" "));
		System.out.println(snake.capitalize("a"));
		System.out.println(snake.capitalize("xyz"));
		System.out.println(snake.uncapitalize(" "));
		System.out.println(snake.uncapitalize("A"));
		System.out.println(snake.uncapitalize("Xyz"));
		System.out.println(snake.snakeToCamelcase("abc"));
		System.out.println(snake.snakeToCamelcase("abc_def"));
		System.out.println(snake.snakeToCamelcase("abc_def_gh"));
		System.out.println(snake.snakeToCamelcase("abc__def___gh"));
		System.out.println(snake.snakeToCamelcase("_abc_def__"));
		System.out.println(snake.camelToSnakecase("Abc"));
		System.out.println(snake.camelToSnakecase("AbcDef"));
		System.out.println(snake.camelToSnakecase("AbcDefGh"));
	}
}
