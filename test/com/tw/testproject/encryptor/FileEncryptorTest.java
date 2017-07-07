package com.tw.testproject.encryptor;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by vohray on 7/7/17.
 */

public class FileEncryptorTest {

  private static final String SRC_FILE_PARTH = "/Users/vohray/Downloads/manage.txt";
  private static final String DST_FILE_PARTH = "/Users/vohray/Downloads/manage_enc.txt";


  @Test
  public void testEncryption() throws IOException {
	 FileEncryptor encryptor = new FileEncryptor();
	 encryptor.encryptFiles(new File(SRC_FILE_PARTH), new File(DST_FILE_PARTH), translationKey);
  }


}
