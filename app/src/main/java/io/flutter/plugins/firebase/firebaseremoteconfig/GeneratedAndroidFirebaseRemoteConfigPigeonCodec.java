package io.flutter.plugins.firebase.firebaseremoteconfig;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.OooOo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class GeneratedAndroidFirebaseRemoteConfigPigeonCodec extends StandardMessageCodec {
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b, ByteBuffer buffer) {
        OooOo.OooO0o0(buffer, "buffer");
        if (b != -127) {
            return super.readValueOfType(b, buffer);
        }
        Object value = readValue(buffer);
        List<? extends Object> list = value instanceof List ? (List) value : null;
        if (list != null) {
            return RemoteConfigPigeonSettings.Companion.fromList(list);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        OooOo.OooO0o0(stream, "stream");
        if (!(obj instanceof RemoteConfigPigeonSettings)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(129);
            writeValue(stream, ((RemoteConfigPigeonSettings) obj).toList());
        }
    }
}
