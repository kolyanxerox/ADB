package o000o00o;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o00O0O0O.OooO0OO;
import oo0O.OooO0O0;

/* loaded from: classes2.dex */
public final class o000Oo0 implements Serializer {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o00O0000 f30806OooO00o;

    public o000Oo0(o00O0000 sessionGenerator) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionGenerator, "sessionGenerator");
        this.f30806OooO00o = sessionGenerator;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object getDefaultValue() {
        return new o000O0o(this.f30806OooO00o.OooO00o(null), null, null);
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, OooO0OO oooO0OO) throws CorruptionException {
        try {
            OooO0O0 oooO0O0 = OooO0O0.f33201OooO0Oo;
            String strOooOooO = o00O0oO.o0000O00.OooOooO(o0OO00OO.OooOoO(inputStream));
            oooO0O0.getClass();
            return (o000O0o) oooO0O0.OooO00o(o000O0o.Companion.serializer(), strOooOooO);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session data", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, OooO0OO oooO0OO) throws IOException {
        byte[] bytes = OooO0O0.f33201OooO0Oo.OooO0O0(o000O0o.Companion.serializer(), (o000O0o) obj).getBytes(o00O0oO.o0OO00O.f31451OooO00o);
        kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return oo00o.OooOo.f33195OooO00o;
    }
}
