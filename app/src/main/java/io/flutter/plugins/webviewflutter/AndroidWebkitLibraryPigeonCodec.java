package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
class AndroidWebkitLibraryPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, ByteBuffer buffer) {
        kotlin.jvm.internal.OooOo.OooO0o0(buffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(buffer);
            if (l == null) {
                return null;
            }
            return FileChooserMode.Companion.ofRaw((int) l.longValue());
        }
        if (b == -126) {
            Long l2 = (Long) readValue(buffer);
            if (l2 == null) {
                return null;
            }
            return ConsoleMessageLevel.Companion.ofRaw((int) l2.longValue());
        }
        if (b == -125) {
            Long l3 = (Long) readValue(buffer);
            if (l3 == null) {
                return null;
            }
            return OverScrollMode.Companion.ofRaw((int) l3.longValue());
        }
        if (b == -124) {
            Long l4 = (Long) readValue(buffer);
            if (l4 == null) {
                return null;
            }
            return SslErrorType.Companion.ofRaw((int) l4.longValue());
        }
        if (b != -123) {
            return super.readValueOfType(b, buffer);
        }
        Long l5 = (Long) readValue(buffer);
        if (l5 == null) {
            return null;
        }
        return MixedContentMode.Companion.ofRaw((int) l5.longValue());
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(stream, "stream");
        if (obj instanceof FileChooserMode) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((FileChooserMode) obj).getRaw()));
            return;
        }
        if (obj instanceof ConsoleMessageLevel) {
            stream.write(130);
            writeValue(stream, Integer.valueOf(((ConsoleMessageLevel) obj).getRaw()));
            return;
        }
        if (obj instanceof OverScrollMode) {
            stream.write(131);
            writeValue(stream, Integer.valueOf(((OverScrollMode) obj).getRaw()));
        } else if (obj instanceof SslErrorType) {
            stream.write(132);
            writeValue(stream, Integer.valueOf(((SslErrorType) obj).getRaw()));
        } else if (!(obj instanceof MixedContentMode)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(133);
            writeValue(stream, Integer.valueOf(((MixedContentMode) obj).getRaw()));
        }
    }
}
