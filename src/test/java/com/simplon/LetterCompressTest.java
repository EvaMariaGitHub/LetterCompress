package com.simplon;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alonso on 27/02/17.
 */
public class LetterCompressTest {

    @Test
    public void performCompression(){
        //set
            LetterCompress s = new LetterCompress("aabcccccaaa");
        //test
            String result = s.compression();
        //assert
            assertEquals("a5b1c5", result);
    }

    @Test
    public void performCompressionWithEmptyString(){
        //set
        LetterCompress s = new LetterCompress("");
        //test
        String result = s.compression();
        //assert
        assertEquals("", result);
    }

    @Test
    public void performCompressionWithNull(){
        //set
        LetterCompress s = new LetterCompress(null);
        //test
        String result = s.compression();
        //assert
        assertEquals("", result);
    }

}
