package o0000Oo0;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import o00000oo.o0Oo0oo;

/* loaded from: classes2.dex */
public final class OooOo00 implements o0Oo0oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f29520OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f29521OooO0O0;

    public OooOo00(ArrayList arrayList, o0Oo0oo o0oo0oo) {
        this.f29520OooO00o = arrayList;
        this.f29521OooO0O0 = o0oo0oo;
    }

    @Override // o00000oo.o0Oo0oo
    public final OutputStream OooO00o(FileOutputStream fileOutputStream, byte[] bArr) {
        return this.f29521OooO0O0.OooO00o(fileOutputStream, bArr);
    }

    @Override // o00000oo.o0Oo0oo
    public final InputStream OooO0O0(InputStream inputStream, byte[] bArr) {
        OooOOO oooOOO = new OooOOO();
        oooOOO.f29511OooOo0O = false;
        oooOOO.f29512OooOo0o = null;
        oooOOO.f29514OooOoO0 = this.f29520OooO00o;
        if (inputStream.markSupported()) {
            oooOOO.f29510OooOo = inputStream;
        } else {
            oooOOO.f29510OooOo = new BufferedInputStream(inputStream);
        }
        oooOOO.f29510OooOo.mark(Integer.MAX_VALUE);
        oooOOO.f29513OooOoO = (byte[]) bArr.clone();
        return oooOOO;
    }
}
