package util;

/**
 * テスト用リソースを管理する
 * @author yasuhiro.tanaka
 *
 */
public class TestResourceManager {
	/** テスト用リソースを配置するルートディレクトリのパス */
	private static String tesrResourcesDir = "target/test-classes";

	/**
	 * テスト用リソースのパスを返す。
	 * テスト用リソース配置ルートディレクトリからの相対パスを引数に指定する。
	 * @param resourcePathUnderTestResources
	 * @return
	 */
	public static String getPath(String resourcePathUnderTestResources){
		return tesrResourcesDir + "/" + resourcePathUnderTestResources;
	}
}
