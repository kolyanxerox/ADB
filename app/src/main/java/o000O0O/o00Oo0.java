package o000o0O;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o00O0O0O.OooO0OO;
import o00O0oO.o0000O00;
import oo0O.OooO0O0;

/* loaded from: classes2.dex */
public final class o00Oo0 implements Serializer {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00Oo0 f30930OooO00o = new o00Oo0();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O0O f30931OooO0O0 = new o00O0O(null, null, null, null, null);

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return f30931OooO0O0;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, OooO0OO oooO0OO) throws CorruptionException {
        try {
            OooO0O0 oooO0O0 = OooO0O0.f33201OooO0Oo;
            String strOooOooO = o0000O00.OooOooO(o0OO00OO.OooOoO(inputStream));
            oooO0O0.getClass();
            return (o00O0O) oooO0O0.OooO00o(o00O0O.Companion.serializer(), strOooOooO);
        } catch (Exception e) {
            throw new CorruptionException("Cannot parse session configs", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, OooO0OO oooO0OO) throws IOException {
        byte[] bytes = OooO0O0.f33201OooO0Oo.OooO0O0(o00O0O.Companion.serializer(), (o00O0O) obj).getBytes(o00O0oO.o0OO00O.f31451OooO00o);
        kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "getBytes(...)");
        outputStream.write(bytes);
        return oo00o.OooOo.f33195OooO00o;
    }
}
