package junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * テストケースを分類し、分類ごとにテストの実行する/しないを制御する。
 * 時間がかかるテストやDBを占有してしまうテストを日中のコミットやビルド時のテストからは除外し
 * 日次で夜間にのみ実行するなどの制御ができる。
 * @author yasuhiro.tanaka
 *
 */
@RunWith(Categories.class)
@ExcludeCategory(SlowTests.class)
@SuiteClasses(SlowAndFastTest.class)
public class CategoriesTests {
}
