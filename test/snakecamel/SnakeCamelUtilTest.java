package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースにする(){
        SnakeCamelUtil snake = new SnakeCamelUtil();
        String expected = "AbcDefGhi";
        String actual = snake.snakeToCamelcase("abc_def_ghi");
        assertThat(actual,is(expected));
    }
	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースにする(){
        SnakeCamelUtil snake = new SnakeCamelUtil();
        String expected = "abc_def_ghi";
        String actual = snake.camelToSnakecase("AbcDefGhi");
        assertThat(actual,is(expected));
    }
	@Test
	public void capitalizeで小文字を大文字にする(){
        SnakeCamelUtil snake = new SnakeCamelUtil();
       String expected = "A";
       String actual = snake.capitalize("a");
       assertThat(actual,is(expected));
   }
	@Test
	public void uncapitalizeで大文字を小文字にする(){
        SnakeCamelUtil snake = new SnakeCamelUtil();
       String expected = "a";
       String actual = snake.uncapitalize("A");
       assertThat(actual,is(expected));
   }
}
