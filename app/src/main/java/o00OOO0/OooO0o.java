package o00OOO0;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class OooO0o {

    /* renamed from: OooO, reason: collision with root package name */
    public final int f32141OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f32142OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f32143OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f32144OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f32145OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f32146OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f32147OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f32148OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f32149OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final boolean f32150OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f32151OooOO0O;
    public final boolean OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public String f32152OooOOO0;

    static {
        OooO0OO oooO0OO = new OooO0OO();
        oooO0OO.f32138OooO00o = true;
        new OooO0o(oooO0OO);
        OooO0OO oooO0OO2 = new OooO0OO();
        oooO0OO2.f32140OooO0OO = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        oooO0OO2.f32139OooO0O0 = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new OooO0o(oooO0OO2);
    }

    public OooO0o(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f32142OooO00o = z;
        this.f32143OooO0O0 = z2;
        this.f32144OooO0OO = i;
        this.f32145OooO0Oo = i2;
        this.f32147OooO0o0 = z3;
        this.f32146OooO0o = z4;
        this.f32148OooO0oO = z5;
        this.f32149OooO0oo = i3;
        this.f32141OooO = i4;
        this.f32150OooOO0 = z6;
        this.f32151OooOO0O = z7;
        this.OooOO0o = z8;
        this.f32152OooOOO0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o00OOO0.OooO0o OooO00o(o00OOO0.o000oOoO r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOO0.OooO0o.OooO00o(o00OOO0.o000oOoO):o00OOO0.OooO0o");
    }

    public final String toString() {
        String string;
        String str = this.f32152OooOOO0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f32142OooO00o) {
            sb.append("no-cache, ");
        }
        if (this.f32143OooO0O0) {
            sb.append("no-store, ");
        }
        int i = this.f32144OooO0OO;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f32145OooO0Oo;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f32147OooO0o0) {
            sb.append("private, ");
        }
        if (this.f32146OooO0o) {
            sb.append("public, ");
        }
        if (this.f32148OooO0oO) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f32149OooO0oo;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f32141OooO;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f32150OooOO0) {
            sb.append("only-if-cached, ");
        }
        if (this.f32151OooOO0O) {
            sb.append("no-transform, ");
        }
        if (this.OooOO0o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.f32152OooOOO0 = string;
        return string;
    }

    public OooO0o(OooO0OO oooO0OO) {
        this.f32142OooO00o = oooO0OO.f32138OooO00o;
        this.f32143OooO0O0 = false;
        this.f32144OooO0OO = -1;
        this.f32145OooO0Oo = -1;
        this.f32147OooO0o0 = false;
        this.f32146OooO0o = false;
        this.f32148OooO0oO = false;
        this.f32149OooO0oo = oooO0OO.f32139OooO0O0;
        this.f32141OooO = -1;
        this.f32150OooOO0 = oooO0OO.f32140OooO0OO;
        this.f32151OooOO0O = false;
        this.OooOO0o = false;
    }
}
