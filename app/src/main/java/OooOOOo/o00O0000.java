package OooOooo;

import Oooo00O.o000000O;
import Oooo0OO.o00oO0o;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00O0000 implements Callable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O000 f13689OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ boolean f13690OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f13691OooOo0o;

    public /* synthetic */ o00O0000(boolean z, String str, o00O000 o00o000) {
        this.f13690OooOo0O = z;
        this.f13691OooOo0o = str;
        this.f13689OooOo = o00o000;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        o00O000 o00o000 = this.f13689OooOo;
        int i = 0;
        boolean z = this.f13690OooOo0O;
        String str = this.f13691OooOo0o;
        String str2 = (z || !o00O00.OooO00o(str, o00o000, true, false).f13700OooO00o) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i++;
        }
        o000000O.OooO0oo(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + o00oO0o.OooO0O0(messageDigest.digest(o00o000.f13688OooOoO0)) + ", atk=" + z + ", ver=12451000.false";
    }
}
