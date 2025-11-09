package io.flutter.plugins.sharedpreferences;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MessagesAsyncPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, ByteBuffer buffer) {
        OooOo.OooO0o0(buffer, "buffer");
        if (b == -127) {
            Long l = (Long) readValue(buffer);
            if (l != null) {
                return StringListLookupResultType.Companion.ofRaw((int) l.longValue());
            }
            return null;
        }
        if (b == -126) {
            Object value = readValue(buffer);
            List<? extends Object> list = value instanceof List ? (List) value : null;
            if (list != null) {
                return SharedPreferencesPigeonOptions.Companion.fromList(list);
            }
            return null;
        }
        if (b != -125) {
            return super.readValueOfType(b, buffer);
        }
        Object value2 = readValue(buffer);
        List<? extends Object> list2 = value2 instanceof List ? (List) value2 : null;
        if (list2 != null) {
            return StringListResult.Companion.fromList(list2);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        OooOo.OooO0o0(stream, "stream");
        if (obj instanceof StringListLookupResultType) {
            stream.write(129);
            writeValue(stream, Integer.valueOf(((StringListLookupResultType) obj).getRaw()));
        } else if (obj instanceof SharedPreferencesPigeonOptions) {
            stream.write(130);
            writeValue(stream, ((SharedPreferencesPigeonOptions) obj).toList());
        } else if (!(obj instanceof StringListResult)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(131);
            writeValue(stream, ((StringListResult) obj).toList());
        }
    }
}
