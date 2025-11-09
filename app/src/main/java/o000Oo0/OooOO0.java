package o000Oo0;

import OoooOOO.C0001o0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class OooOO0 implements OooOo00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final C0001o0 f30341OooOo = new C0001o0(19);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f30342OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object f30343OooOo0o;

    public OooOO0(o000O0Oo.OooO0o oooO0o) {
        this.f30342OooOo0O = oooO0o;
        this.f30343OooOo0o = f30341OooOo;
    }

    @Override // o000Oo0.OooOo00
    public void OooO00o(OooOOOO oooOOOO, int i) throws IOException {
        int[] iArr = (int[]) this.f30343OooOo0o;
        try {
            oooOOOO.read((byte[]) this.f30342OooOo0O, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            oooOOOO.close();
        }
    }

    public OooOO0(byte[] bArr, int[] iArr) {
        this.f30342OooOo0O = bArr;
        this.f30343OooOo0o = iArr;
    }
}
