package o00OOOoO;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface o0000O00 extends o00, WritableByteChannel {
    OutputStream outputStream();

    o0000O00 writeUtf8(String str);
}
