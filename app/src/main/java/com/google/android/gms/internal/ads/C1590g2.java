package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.ads.internal.client.zzbe;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.g2 */
/* loaded from: classes2.dex */
public final class C1590g2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOooO */
    public static volatile Long f19187OooOooO;

    /* renamed from: Oooo000 */
    public static volatile Long f19190Oooo000;

    /* renamed from: Oooo00o */
    public static volatile String f19192Oooo00o;

    /* renamed from: Oooo0O0 */
    public static volatile Long f19193Oooo0O0;

    /* renamed from: OooOoo */
    public final /* synthetic */ int f19195OooOoo;

    /* renamed from: OooOooo */
    public static final Object f19188OooOooo = new Object();

    /* renamed from: Oooo00O */
    public static final Object f19191Oooo00O = new Object();

    /* renamed from: Oooo0 */
    public static final Object f19189Oooo0 = new Object();

    /* renamed from: Oooo0OO */
    public static final Object f19194Oooo0OO = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1590g2(C2143v1 c2143v1, String str, String str2, C2104u c2104u, int i, int i2, int i3) {
        super(c2143v1, str, str2, c2104u, i, i2);
        this.f19195OooOoo = i3;
    }

    private final void OooO0OO() {
        C2104u c2104u = this.f23492OooOoO0;
        c2104u.OooO0Oo();
        C1514e0.o00000O0((C1514e0) c2104u.f25822OooOo0o, -1L);
        C2104u c2104u2 = this.f23492OooOoO0;
        c2104u2.OooO0Oo();
        C1514e0.o00000((C1514e0) c2104u2.f25822OooOo0o, -1L);
        int[] iArr = (int[]) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o);
        synchronized (this.f23492OooOoO0) {
            try {
                C2104u c2104u3 = this.f23492OooOoO0;
                long j = iArr[0];
                c2104u3.OooO0Oo();
                C1514e0.o00000O0((C1514e0) c2104u3.f25822OooOo0o, j);
                C2104u c2104u4 = this.f23492OooOoO0;
                long j2 = iArr[1];
                c2104u4.OooO0Oo();
                C1514e0.o00000((C1514e0) c2104u4.f25822OooOo0o, j2);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    C2104u c2104u5 = this.f23492OooOoO0;
                    c2104u5.OooO0Oo();
                    C1514e0.o000000o((C1514e0) c2104u5.f25822OooOo0o, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void OooO0Oo() {
        if (f19190Oooo000 == null) {
            synchronized (f19191Oooo00O) {
                try {
                    if (f19190Oooo000 == null) {
                        f19190Oooo000 = (Long) this.f23491OooOoO.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            long jLongValue = f19190Oooo000.longValue();
            c2104u.OooO0Oo();
            C1514e0.OooOoo((C1514e0) c2104u.f25822OooOo0o, jLongValue);
        }
    }

    private final void OooO0o() {
        Boolean bool = (Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17874o00O0Oo);
        bool.getClass();
        String str = (String) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o, bool);
        C1921p1 c1921p1 = new C1921p1(13);
        c1921p1.f23174OooO0oO = -1L;
        c1921p1.f23175OooO0oo = -1L;
        HashMap mapOooO0oo = ze0.OooO0oo(str);
        if (mapOooO0oo != null) {
            c1921p1.f23174OooO0oO = ((Long) mapOooO0oo.get(0)).longValue();
            c1921p1.f23175OooO0oo = ((Long) mapOooO0oo.get(1)).longValue();
        }
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            long j = c1921p1.f23174OooO0oO;
            c2104u.OooO0Oo();
            C1514e0.o000000O((C1514e0) c2104u.f25822OooOo0o, j);
            C2104u c2104u2 = this.f23492OooOoO0;
            long j2 = c1921p1.f23175OooO0oo;
            c2104u2.OooO0Oo();
            C1514e0.Oooo00O((C1514e0) c2104u2.f25822OooOo0o, j2);
        }
    }

    private final void OooO0o0() {
        C2104u c2104u = this.f23492OooOoO0;
        c2104u.OooO0Oo();
        C1514e0.Oooo000((C1514e0) c2104u.f25822OooOo0o, "E");
        if (f19192Oooo00o == null) {
            synchronized (f19189Oooo0) {
                try {
                    if (f19192Oooo00o == null) {
                        f19192Oooo00o = (String) this.f23491OooOoO.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u2 = this.f23492OooOoO0;
            String str = f19192Oooo00o;
            c2104u2.OooO0Oo();
            C1514e0.Oooo000((C1514e0) c2104u2.f25822OooOo0o, str);
        }
    }

    private final void OooO0oO() {
        synchronized (this.f23492OooOoO0) {
            String str = (String) this.f23491OooOoO.invoke(null, null);
            C2032s1 c2032s1 = new C2032s1(13);
            HashMap mapOooO0oo = ze0.OooO0oo(str);
            if (mapOooO0oo != null) {
                c2032s1.f23971OooO0oO = (Long) mapOooO0oo.get(0);
                c2032s1.f23972OooO0oo = (Long) mapOooO0oo.get(1);
            }
            C2104u c2104u = this.f23492OooOoO0;
            long jLongValue = c2032s1.f23971OooO0oO.longValue();
            c2104u.OooO0Oo();
            C1514e0.o00000Oo((C1514e0) c2104u.f25822OooOo0o, jLongValue);
            C2104u c2104u2 = this.f23492OooOoO0;
            long jLongValue2 = c2032s1.f23972OooO0oo.longValue();
            c2104u2.OooO0Oo();
            C1514e0.o00000o0((C1514e0) c2104u2.f25822OooOo0o, jLongValue2);
        }
    }

    private final void OooO0oo() {
        if (f19193Oooo0O0 == null) {
            synchronized (f19194Oooo0OO) {
                try {
                    if (f19193Oooo0O0 == null) {
                        f19193Oooo0O0 = (Long) this.f23491OooOoO.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f23492OooOoO0) {
            C2104u c2104u = this.f23492OooOoO0;
            long jLongValue = f19193Oooo0O0.longValue();
            c2104u.OooO0Oo();
            C1514e0.OoooOoo((C1514e0) c2104u.f25822OooOo0o, jLongValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() throws InvocationTargetException {
        switch (this.f19195OooOoo) {
            case 0:
                if (f19187OooOooO == null) {
                    synchronized (f19188OooOooo) {
                        try {
                            if (f19187OooOooO == null) {
                                f19187OooOooO = (Long) this.f23491OooOoO.invoke(null, null);
                            }
                        } finally {
                        }
                    }
                }
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u = this.f23492OooOoO0;
                    long jLongValue = f19187OooOooO.longValue();
                    c2104u.OooO0Oo();
                    C1514e0.o00000OO((C1514e0) c2104u.f25822OooOo0o, jLongValue);
                }
                return;
            case 1:
                OooO0Oo();
                return;
            case 2:
                OooO0o0();
                return;
            case 3:
                OooO0oo();
                return;
            case 4:
                String str = (String) this.f23491OooOoO.invoke(null, null);
                synchronized (this.f23492OooOoO0) {
                    C2104u c2104u2 = this.f23492OooOoO0;
                    c2104u2.OooO0Oo();
                    C1514e0.o0O0O00((C1514e0) c2104u2.f25822OooOo0o, str);
                }
                return;
            case 5:
                C2104u c2104u3 = this.f23492OooOoO0;
                c2104u3.OooO0Oo();
                C1514e0.Ooooooo((C1514e0) c2104u3.f25822OooOo0o, 3);
                try {
                    int i = 1;
                    if (true == ((Boolean) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o)).booleanValue()) {
                        i = 2;
                    }
                    c2104u3.OooO0Oo();
                    C1514e0.Ooooooo((C1514e0) c2104u3.f25822OooOo0o, i);
                    return;
                } catch (InvocationTargetException e) {
                    if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e;
                    }
                    return;
                }
            case 6:
                OooO0OO();
                return;
            case 7:
                int i2 = true == ((Boolean) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o)).booleanValue() ? 2 : 1;
                C2104u c2104u4 = this.f23492OooOoO0;
                c2104u4.OooO0Oo();
                C1514e0.o00O0O((C1514e0) c2104u4.f25822OooOo0o, i2);
                return;
            case 8:
                C2104u c2104u5 = this.f23492OooOoO0;
                c2104u5.OooO0Oo();
                C1514e0.OooOooo((C1514e0) c2104u5.f25822OooOo0o, -1L);
                long jLongValue2 = ((Long) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o)).longValue();
                c2104u5.OooO0Oo();
                C1514e0.OooOooo((C1514e0) c2104u5.f25822OooOo0o, jLongValue2);
                return;
            case 9:
                OooO0o();
                return;
            case 10:
                C2104u c2104u6 = this.f23492OooOoO0;
                try {
                    int i3 = 1;
                    if (true == ((Boolean) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o)).booleanValue()) {
                        i3 = 2;
                    }
                    c2104u6.OooO0Oo();
                    C1514e0.o00Ooo((C1514e0) c2104u6.f25822OooOo0o, i3);
                    return;
                } catch (InvocationTargetException unused) {
                    c2104u6.OooO0Oo();
                    C1514e0.o00Ooo((C1514e0) c2104u6.f25822OooOo0o, 3);
                    return;
                }
            case 11:
                OooO0oO();
                return;
            default:
                C2104u c2104u7 = this.f23492OooOoO0;
                c2104u7.OooO0Oo();
                C1514e0.o00o0O((C1514e0) c2104u7.f25822OooOo0o, 3);
                boolean zBooleanValue = ((Boolean) this.f23491OooOoO.invoke(null, this.f23489OooOo0O.f24814OooO00o)).booleanValue();
                synchronized (this.f23492OooOoO0) {
                    try {
                        if (zBooleanValue) {
                            C2104u c2104u8 = this.f23492OooOoO0;
                            c2104u8.OooO0Oo();
                            C1514e0.o00o0O((C1514e0) c2104u8.f25822OooOo0o, 2);
                        } else {
                            C2104u c2104u9 = this.f23492OooOoO0;
                            c2104u9.OooO0Oo();
                            C1514e0.o00o0O((C1514e0) c2104u9.f25822OooOo0o, 1);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590g2(C2143v1 c2143v1, C2104u c2104u, int i, int i2) {
        super(c2143v1, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c2104u, i, 44);
        this.f19195OooOoo = i2;
        switch (i2) {
            case 1:
                super(c2143v1, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c2104u, i, 22);
                break;
            case 2:
                super(c2143v1, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c2104u, i, 1);
                break;
            case 3:
            case 7:
            case 10:
            default:
                break;
            case 4:
                super(c2143v1, "3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", c2104u, i, 89);
                break;
            case 5:
                super(c2143v1, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c2104u, i, 49);
                break;
            case 6:
                super(c2143v1, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", c2104u, i, 5);
                break;
            case 8:
                super(c2143v1, "P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", c2104u, i, 12);
                break;
            case 9:
                super(c2143v1, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", c2104u, i, 3);
                break;
            case 11:
                super(c2143v1, "SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", c2104u, i, 51);
                break;
            case 12:
                super(c2143v1, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", c2104u, i, 48);
                break;
        }
    }
}
