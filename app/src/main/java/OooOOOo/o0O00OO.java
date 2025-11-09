package OoooOOO;

import Oooo00O.o000000O;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o0O00OO extends o0O000Oo {

    /* renamed from: OooOo */
    public String f14335OooOo;

    /* renamed from: OooOoO */
    public int f14336OooOoO;

    /* renamed from: OooOoO0 */
    public String f14337OooOoO0;

    /* renamed from: OooOoOO */
    public String f14338OooOoOO;

    /* renamed from: OooOoo */
    public long f14339OooOoo;

    /* renamed from: OooOoo0 */
    public String f14340OooOoo0;

    /* renamed from: OooOooO */
    public final long f14341OooOooO;

    /* renamed from: OooOooo */
    public final long f14342OooOooo;

    /* renamed from: Oooo0 */
    public String f14343Oooo0;

    /* renamed from: Oooo000 */
    public List f14344Oooo000;

    /* renamed from: Oooo00O */
    public String f14345Oooo00O;

    /* renamed from: Oooo00o */
    public int f14346Oooo00o;

    /* renamed from: Oooo0O0 */
    public String f14347Oooo0O0;

    /* renamed from: Oooo0OO */
    public long f14348Oooo0OO;

    /* renamed from: Oooo0o0 */
    public String f14349Oooo0o0;

    public o0O00OO(o0OO0oO0 o0oo0oo0, long j, long j2) {
        super(o0oo0oo0);
        this.f14348Oooo0OO = 0L;
        this.f14349Oooo0o0 = null;
        this.f14341OooOooO = j;
        this.f14342OooOooo = j2;
    }

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.oOO0 OooOOOO(java.lang.String r48) throws java.lang.IllegalAccessException, java.security.NoSuchAlgorithmException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o0O00OO.OooOOOO(java.lang.String):OoooOOO.oOO0");
    }

    public final void OooOOOo() {
        String str;
        OooOO0O();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14574OooOo0O;
        o0O o0o = o0oo0oo0.f14518OooOoO;
        o0OO0oO0.OooOO0O(o0o);
        boolean zOooO = o0o.OooOOo().OooO(oO00000.ANALYTICS_STORAGE);
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (zOooO) {
            byte[] bArr = new byte[16];
            oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
            o0OO0oO0.OooOO0O(ooo00oo);
            ooo00oo.Oooooo0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14401Oooo00o.OooO0O0("Analytics Storage consent is not granted");
            str = null;
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14401Oooo00o.OooO0O0("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f14347Oooo0O0 = str;
        o0oo0oo0.f14527Oooo000.getClass();
        this.f14348Oooo0OO = System.currentTimeMillis();
    }

    public final String OooOOo() {
        OooOO0O();
        OooOO0o();
        o000000O.OooO0oo(this.f14343Oooo0);
        return this.f14343Oooo0;
    }

    public final String OooOOo0() {
        OooOO0o();
        o000000O.OooO0oo(this.f14335OooOo);
        return this.f14335OooOo;
    }
}
