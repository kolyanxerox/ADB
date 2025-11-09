package o00O0Oo0;

import com.google.android.gms.internal.ads.pz0;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import o00O0o.OooOO0;
import o00O0oO.o000000;
import o00O0oO.o0OO00O;

/* loaded from: classes3.dex */
public abstract class oo000o extends o0OOO0 {
    public static void OooOO0o(File file, File target) {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(target, "target");
        if (!file.exists()) {
            throw new OooOo00(file, null, "The source file doesn't exist.");
        }
        if (target.exists() && !target.delete()) {
            throw new OooOo00(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new pz0(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                o0OO00OO.OooO0oO(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String OooOOO(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Charset charset = o0OO00O.f31451OooO00o;
        kotlin.jvm.internal.OooOo.OooO0o0(file, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int i = inputStreamReader.read(cArr); i >= 0; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
            inputStreamReader.close();
            return string;
        } finally {
        }
    }

    public static ArrayList OooOOO0(File file) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Charset charset = o0OO00O.f31451OooO00o;
        kotlin.jvm.internal.OooOo.OooO0o0(charset, "charset");
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new OooOO0(new o00O0.o00Oo0(bufferedReader, 1)).iterator();
            while (it.hasNext()) {
                String it2 = (String) it.next();
                kotlin.jvm.internal.OooOo.OooO0o0(it2, "it");
                arrayList.add(it2);
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static File OooOOOO(File file) {
        int length;
        int iOoooO0;
        File file2 = new File(UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        String path = file2.getPath();
        kotlin.jvm.internal.OooOo.OooO0Oo(path, "getPath(...)");
        char c = File.separatorChar;
        int iOoooO02 = o000000.OoooO0(path, c, 0, 4);
        if (iOoooO02 != 0) {
            length = (iOoooO02 <= 0 || path.charAt(iOoooO02 + (-1)) != ':') ? (iOoooO02 == -1 && o000000.Oooo0oO(path, ':')) ? path.length() : 0 : iOoooO02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iOoooO0 = o000000.OoooO0(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iOoooO03 = o000000.OoooO0(path, c, iOoooO0 + 1, 4);
            length = iOoooO03 >= 0 ? iOoooO03 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        if ((string.length() == 0) || o000000.Oooo0oO(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static final void OooOOOo(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(text, "text");
        kotlin.jvm.internal.OooOo.OooO0o0(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        kotlin.jvm.internal.OooOo.OooO0O0(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        kotlin.jvm.internal.OooOo.OooO0Oo(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < text.length()) {
            int iMin = Math.min(8192 - i2, text.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            kotlin.jvm.internal.OooOo.OooO0Oo(cArrArray, "array(...)");
            text.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
