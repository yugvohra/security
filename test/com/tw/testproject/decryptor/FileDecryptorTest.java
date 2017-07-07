package com.tw.testproject.decryptor;

import com.tw.testproject.decryptor.FileDecryptor;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by vohray on 7/7/17.
 */

public class FileDecryptorTest {

  private static final String DST_FILE_PARTH = "/Users/vohray/Downloads/manage_dec.txt";
  private static final String SRC_FILE_PARTH = "/Users/vohray/Downloads/manage_enc.txt";


  @Test
  public void testEncryption() throws IOException {
	 FileDecryptor fileDecryptor = new FileDecryptor();
	 fileDecryptor.decryptFile(new File(SRC_FILE_PARTH), new File(DST_FILE_PARTH), translationKey);
  }


}
