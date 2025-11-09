package o00OOOoO;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface o0000oo extends o0O0ooO, ReadableByteChannel {
    boolean OooOO0o(o0000O0 o0000o02);

    InputStream inputStream();

    byte[] readByteArray();

    String readString(Charset charset);

    void skip(long j);
}
