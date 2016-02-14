package util;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * テスト用リソースを管理する
 * @author yasuhiro.tanaka
 *
 */
public class TestResourceManager {

	/**
	 * テスト用リソースをクラスパス配下から検索し絶対パスを返す。
	 * テスト用リソース配置ルートディレクトリからの相対パスを引数に指定する。
	 * @param resourcePathUnderTestResources
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String getPath(String resourcePathUnderTestResources) throws FileNotFoundException{
		String[] classPath = System.getProperty("java.class.path").split(";");
		for(String path : classPath){
			File targetFile = new File(path + System.getProperty("file.separator") + resourcePathUnderTestResources);
			if(targetFile.exists()){
				return targetFile.getAbsolutePath();
			}
		}

		throw new FileNotFoundException("対象パスが見つかりません。[ path = " + resourcePathUnderTestResources + " ]");
	}
}
