package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.tasks.Task;
import com.ironsource.InterfaceC3771vj;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import org.apache.tika.fork.ForkServer;

/* renamed from: com.google.android.gms.internal.ads.hg */
/* loaded from: classes2.dex */
public abstract class AbstractC1641hg {

    /* renamed from: Ooooo00 */
    public static Task f19768Ooooo00;

    /* renamed from: Ooooo0o */
    public static AppSetIdClient f19769Ooooo0o;

    /* renamed from: OooO00o */
    public static final int[] f19719OooO00o = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: OooO0O0 */
    public static final int[] f19720OooO0O0 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: OooO0OO */
    public static final int[] f19721OooO0OO = {InterfaceC3771vj.b.f12380b, IronSourceError.ERROR_OLD_INIT_API_CONTEXT_IS_NULL, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, CommonGatewayClient.CODE_400, CommonGatewayClient.CODE_400, 2048};

    /* renamed from: OooO0Oo */
    public static final String[] f19722OooO0Oo = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: OooO0o0 */
    public static final int[] f19724OooO0o0 = {44100, 48000, 32000};

    /* renamed from: OooO0o */
    public static final int[] f19723OooO0o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: OooO0oO */
    public static final int[] f19725OooO0oO = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: OooO0oo */
    public static final int[] f19726OooO0oo = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: OooO */
    public static final int[] f19718OooO = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: OooOO0 */
    public static final int[] f19727OooOO0 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: OooOO0O */
    public static final o0O f19728OooOO0O = new o0O(17);
    public static final C1591g3 OooOO0o = new C1591g3(0);

    /* renamed from: OooOOO0 */
    public static final oOo0o00 f19730OooOOO0 = new oOo0o00("", "gads:afs:csa:experiment_id", 4);

    /* renamed from: OooOOO */
    public static final oOo0o00 f19729OooOOO = new oOo0o00("", "gads:app_index:experiment_id", 4);

    /* renamed from: OooOOOO */
    public static final oOo0o00 f19731OooOOOO = new oOo0o00("", "gads:block_autoclicks_experiment_id", 4);

    /* renamed from: OooOOOo */
    public static final oOo0o00 f19732OooOOOo = new oOo0o00("", "gads:sdk_core_experiment_id", 4);

    /* renamed from: OooOOo0 */
    public static final oOo0o00 f19734OooOOo0 = new oOo0o00("", "gads:spam_app_context:experiment_id", 4);

    /* renamed from: OooOOo */
    public static final oOo0o00 f19733OooOOo = new oOo0o00("", "gads:temporary_experiment_id:1", 4);

    /* renamed from: OooOOoo */
    public static final oOo0o00 f19735OooOOoo = new oOo0o00("", "gads:temporary_experiment_id:10", 4);

    /* renamed from: OooOo00 */
    public static final oOo0o00 f19737OooOo00 = new oOo0o00("", "gads:temporary_experiment_id:11", 4);
    public static final oOo0o00 OooOo0 = new oOo0o00("", "gads:temporary_experiment_id:12", 4);

    /* renamed from: OooOo0O */
    public static final oOo0o00 f19738OooOo0O = new oOo0o00("", "gads:temporary_experiment_id:13", 4);

    /* renamed from: OooOo0o */
    public static final oOo0o00 f19739OooOo0o = new oOo0o00("", "gads:temporary_experiment_id:14", 4);

    /* renamed from: OooOo */
    public static final oOo0o00 f19736OooOo = new oOo0o00("", "gads:temporary_experiment_id:15", 4);

    /* renamed from: OooOoO0 */
    public static final oOo0o00 f19741OooOoO0 = new oOo0o00("", "gads:temporary_experiment_id:2", 4);

    /* renamed from: OooOoO */
    public static final oOo0o00 f19740OooOoO = new oOo0o00("", "gads:temporary_experiment_id:3", 4);

    /* renamed from: OooOoOO */
    public static final oOo0o00 f19742OooOoOO = new oOo0o00("", "gads:temporary_experiment_id:4", 4);

    /* renamed from: OooOoo0 */
    public static final oOo0o00 f19744OooOoo0 = new oOo0o00("", "gads:temporary_experiment_id:5", 4);

    /* renamed from: OooOoo */
    public static final oOo0o00 f19743OooOoo = new oOo0o00("", "gads:temporary_experiment_id:6", 4);

    /* renamed from: OooOooO */
    public static final oOo0o00 f19745OooOooO = new oOo0o00("", "gads:temporary_experiment_id:7", 4);

    /* renamed from: OooOooo */
    public static final oOo0o00 f19746OooOooo = new oOo0o00("", "gads:temporary_experiment_id:8", 4);

    /* renamed from: Oooo000 */
    public static final oOo0o00 f19749Oooo000 = new oOo0o00("", "gads:temporary_experiment_id:9", 4);

    /* renamed from: Oooo00O */
    public static final oOo0o00 f19750Oooo00O = new oOo0o00("", "gads:corewebview:experiment_id", 4);

    /* renamed from: Oooo00o */
    public static final oOo0o00 f19751Oooo00o = new oOo0o00("", "gads:pan:experiment_id", 4);

    /* renamed from: Oooo0 */
    public static final C1591g3 f19748Oooo0 = new C1591g3(8);

    /* renamed from: Oooo0O0 */
    public static final C1591g3 f19752Oooo0O0 = new C1591g3(11);

    /* renamed from: Oooo0OO */
    public static final C1591g3 f19753Oooo0OO = new C1591g3(13);

    /* renamed from: Oooo0o0 */
    public static final C1591g3 f19755Oooo0o0 = new C1591g3(15);

    /* renamed from: Oooo0o */
    public static final C1591g3 f19754Oooo0o = new C1591g3(17);

    /* renamed from: Oooo0oO */
    public static final C1591g3 f19756Oooo0oO = new C1591g3(25);

    /* renamed from: Oooo0oo */
    public static final C1591g3 f19757Oooo0oo = new C1591g3(27);

    /* renamed from: Oooo */
    public static final C2250xy f19747Oooo = new C2250xy(0);

    /* renamed from: OoooO00 */
    public static final Object f19760OoooO00 = new Object();

    /* renamed from: OoooO0 */
    public static final C2250xy f19759OoooO0 = new C2250xy(6);

    /* renamed from: OoooO0O */
    public static final C2250xy f19761OoooO0O = new C2250xy(9);

    /* renamed from: OoooO */
    public static final C2250xy f19758OoooO = new C2250xy(11);

    /* renamed from: OoooOO0 */
    public static final C2250xy f19762OoooOO0 = new C2250xy(13);
    public static final C2250xy o000oOoO = new C2250xy(15);

    /* renamed from: OoooOOO */
    public static final C2250xy f19763OoooOOO = new C2250xy(17);

    /* renamed from: OoooOOo */
    public static final C2250xy f19764OoooOOo = new C2250xy(20);

    /* renamed from: OoooOo0 */
    public static final C2250xy f19765OoooOo0 = new C2250xy(23);

    /* renamed from: OoooOoO */
    public static final C2250xy f19766OoooOoO = new C2250xy(28);

    /* renamed from: OoooOoo */
    public static final be0 f19767OoooOoo = new be0(0);

    /* renamed from: OooooO0 */
    public static final Object f19770OooooO0 = new Object();

    /* renamed from: OooooOO */
    public static final be0 f19771OooooOO = new be0(4);

    /* renamed from: OooooOo */
    public static final be0 f19772OooooOo = new be0(6);

    public static int OooO(byte[] bArr, int i, int i2) {
        int iOooOO0O = OooOO0O(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return iOooOO0O;
        }
        while (true) {
            int length = bArr.length;
            if (iOooOO0O >= length - 1) {
                return length;
            }
            int i3 = iOooOO0O + 1;
            if ((iOooOO0O - i) % 2 == 0 && bArr[i3] == 0) {
                return iOooOO0O;
            }
            iOooOO0O = OooOO0O(i3, bArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Oooo0oO.o0O0O00 OooO00o(com.google.android.gms.internal.ads.o000OOo0 r10) {
        /*
            r0 = 16
            int r1 = r10.OooO0o(r0)
            int r0 = r10.OooO0o(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.OooO0o(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.OooO0o(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.OooO0o(r1)
            boolean r2 = r10.OooOo0o()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.OooO0o(r2)
            boolean r5 = r10.OooOo0o()
            if (r5 == 0) goto L47
            int r5 = r10.OooO0o(r4)
            if (r5 <= 0) goto L47
            r10.OooOo0(r1)
        L47:
            boolean r5 = r10.OooOo0o()
            r6 = 1
            r7 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r6 == r5) goto L56
            r5 = r8
            goto L57
        L56:
            r5 = r7
        L57:
            int r10 = r10.OooO0o(r3)
            int[] r9 = com.google.android.gms.internal.ads.AbstractC1641hg.f19721OooO0OO
            if (r5 != r8) goto L66
            r8 = 13
            if (r10 != r8) goto L66
            r10 = r9[r8]
            goto L94
        L66:
            r8 = 0
            if (r5 != r7) goto L93
            r7 = 14
            if (r10 >= r7) goto L93
            r7 = r9[r10]
            int r2 = r2 % 5
            r8 = 8
            if (r2 == r6) goto L8c
            r6 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r8) goto L84
            if (r10 != r6) goto L91
        L84:
            int r10 = r7 + 1
            goto L94
        L87:
            if (r10 == r8) goto L84
            if (r10 != r6) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r8) goto L91
            goto L84
        L91:
            r10 = r7
            goto L94
        L93:
            r10 = r8
        L94:
            Oooo0oO.o0O0O00 r1 = new Oooo0oO.o0O0O00
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1641hg.OooO00o(com.google.android.gms.internal.ads.o000OOo0):Oooo0oO.o0O0O00");
    }

    public static String OooO0O0(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f19760OoooO00) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    public static int OooO0OO(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = i4 - 1;
        int i7 = f19724OooO0o0[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f19723OooO0o[i6] : f19725OooO0oO[i6]) * 12) / i7) + i8) * 4;
        }
        int i9 = i2 == 3 ? i3 == 2 ? f19726OooO0oo[i6] : f19718OooO[i6] : f19727OooOO0[i6];
        if (i2 == 3) {
            return OooO0oO.OooOo.OooO0O0(i9, 144, i7, i8);
        }
        return OooO0oO.OooOo.OooO0O0(i3 == 1 ? 72 : 144, i9, i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b9, code lost:
    
        if (r11 != 3) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.oo000o OooO0Oo(com.google.android.gms.internal.ads.o000OOo0 r11, boolean r12) throws com.google.android.gms.internal.ads.C2185w6 {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1641hg.OooO0Oo(com.google.android.gms.internal.ads.o000OOo0, boolean):com.google.android.gms.internal.ads.oo000o");
    }

    public static void OooO0o(Context context, boolean z) {
        synchronized (f19770OooooO0) {
            try {
                if (f19769Ooooo0o == null) {
                    f19769Ooooo0o = AppSet.getClient(context);
                }
                Task task = f19768Ooooo00;
                if (task == null || ((task.isComplete() && !f19768Ooooo00.isSuccessful()) || (z && f19768Ooooo00.isComplete()))) {
                    AppSetIdClient appSetIdClient = f19769Ooooo0o;
                    Oooo00O.o000000O.OooO(appSetIdClient, "the appSetIdClient shouldn't be null");
                    f19768Ooooo00 = appSetIdClient.getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void OooO0o0(int i, r40 r40Var) {
        r40Var.OooO0oO(7);
        byte[] bArr = r40Var.f23745OooO00o;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void OooO0oO(String str, String str2) {
        synchronized (f19760OoooO00) {
            Log.d(str, OooO0O0(str2, null));
        }
    }

    public static int OooO0oo(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static void OooOO0(String str, String str2) {
        synchronized (f19760OoooO00) {
            Log.e(str, OooO0O0(str2, null));
        }
    }

    public static int OooOO0O(int i, byte[] bArr) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    public static int OooOO0o(o000OOo0 o000ooo02) throws C2185w6 {
        int iOooO0o = o000ooo02.OooO0o(4);
        if (iOooO0o == 15) {
            if (o000ooo02.OooO00o() >= 24) {
                return o000ooo02.OooO0o(24);
            }
            throw C2185w6.OooO00o(null, "AAC header insufficient data");
        }
        if (iOooO0o < 13) {
            return f19719OooO00o[iOooO0o];
        }
        throw C2185w6.OooO00o(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int OooOOO(int i, r40 r40Var) {
        byte[] bArr = r40Var.f23745OooO00o;
        int i2 = r40Var.f23746OooO0O0;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & ForkServer.ERROR) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    public static void OooOOO0(String str, String str2, Throwable th) {
        synchronized (f19760OoooO00) {
            Log.e(str, OooO0O0(str2, th));
        }
    }

    public static void OooOOOO(String str, String str2) {
        synchronized (f19760OoooO00) {
            Log.i(str, OooO0O0(str2, null));
        }
    }

    public static gn0 OooOOOo(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return rm0.OooOOo0("");
        }
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int iOooO = OooO(bArr, i2, i);
        int i3 = 0;
        while (i2 < iOooO) {
            String str = new String(bArr, i2, iOooO - i2, OooOo0(i));
            int length = objArrCopyOf.length;
            int i4 = i3 + 1;
            int iOooO0o = lm0.OooO0o(length, i4);
            if (iOooO0o > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
            }
            objArrCopyOf[i3] = str;
            i2 = OooO0oo(i) + iOooO;
            iOooO = OooO(bArr, i2, i);
            i3 = i4;
        }
        gn0 gn0VarOooOOO = rm0.OooOOO(i3, objArrCopyOf);
        return gn0VarOooOOO.isEmpty() ? rm0.OooOOo0("") : gn0VarOooOOO;
    }

    public static String OooOOo(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static void OooOOo0(String str, String str2) {
        synchronized (f19760OoooO00) {
            Log.w(str, OooO0O0(str2, null));
        }
    }

    public static void OooOOoo(String str, String str2, Throwable th) {
        synchronized (f19760OoooO00) {
            Log.w(str, OooO0O0(str2, th));
        }
    }

    public static Charset OooOo0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String OooOo00(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x008d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:64:0x0006, B:68:0x0013, B:81:0x003e, B:84:0x0049, B:86:0x006b, B:90:0x0071, B:102:0x008d, B:103:0x008f, B:106:0x0095, B:109:0x009f, B:92:0x007b, B:96:0x0082, B:71:0x0023), top: B:115:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x006b A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:64:0x0006, B:68:0x0013, B:81:0x003e, B:84:0x0049, B:86:0x006b, B:90:0x0071, B:102:0x008d, B:103:0x008f, B:106:0x0095, B:109:0x009f, B:92:0x007b, B:96:0x0082, B:71:0x0023), top: B:115:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooOo0O(com.google.android.gms.internal.ads.r40 r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r1.f23746OooO0O0
        L6:
            int r3 = r1.OooOOOO()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La5
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.OooOOo0()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.OooOooO()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.OooOoO()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto La9
        L23:
            int r7 = r1.OooOo()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.OooOo()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8     // Catch: java.lang.Throwable -> L20
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L39
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L39
            if (r10 != 0) goto L39
            goto La5
        L39:
            r7 = 4
            if (r0 != r7) goto L69
            if (r24 != 0) goto L69
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L49
        L46:
            r4 = r6
            goto La5
        L49:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L69:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L70
            goto L71
        L70:
            r4 = r6
        L71:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L95
            goto L46
        L95:
            int r3 = r1.OooOOOO()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L20
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L46
        L9f:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> L20
            r1.OooOO0O(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        La5:
            r1.OooOO0(r2)
            return r4
        La9:
            r1.OooOO0(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1641hg.OooOo0O(com.google.android.gms.internal.ads.r40, int, int, boolean):boolean");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:437:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0298 A[Catch: all -> 0x0136, Exception -> 0x0256, OutOfMemoryError -> 0x025b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0136, blocks: (B:366:0x0105, B:376:0x013f, B:379:0x0146, B:390:0x0170, B:393:0x01a2, B:401:0x01cd, B:403:0x01e1, B:405:0x01e8, B:404:0x01e4, B:419:0x0207, B:421:0x021e, B:423:0x0245, B:425:0x024c, B:424:0x0248, B:448:0x0285, B:451:0x0298, B:453:0x02a1, B:464:0x02e4, B:466:0x0301, B:468:0x0308, B:467:0x0304, B:461:0x02c4, B:463:0x02e0, B:480:0x0326, B:486:0x0367, B:490:0x03a1, B:494:0x03ae, B:495:0x03b4, B:497:0x03ba, B:499:0x03c1, B:500:0x03c5, B:508:0x03e6, B:512:0x0411, B:514:0x041c, B:515:0x044e, B:516:0x0459, B:518:0x045f, B:520:0x0466, B:521:0x046a, B:526:0x0483, B:533:0x0494, B:535:0x04be, B:536:0x04cd, B:537:0x04d8), top: B:549:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02c4 A[Catch: all -> 0x0136, Exception -> 0x02be, OutOfMemoryError -> 0x02c1, TryCatch #2 {all -> 0x0136, blocks: (B:366:0x0105, B:376:0x013f, B:379:0x0146, B:390:0x0170, B:393:0x01a2, B:401:0x01cd, B:403:0x01e1, B:405:0x01e8, B:404:0x01e4, B:419:0x0207, B:421:0x021e, B:423:0x0245, B:425:0x024c, B:424:0x0248, B:448:0x0285, B:451:0x0298, B:453:0x02a1, B:464:0x02e4, B:466:0x0301, B:468:0x0308, B:467:0x0304, B:461:0x02c4, B:463:0x02e0, B:480:0x0326, B:486:0x0367, B:490:0x03a1, B:494:0x03ae, B:495:0x03b4, B:497:0x03ba, B:499:0x03c1, B:500:0x03c5, B:508:0x03e6, B:512:0x0411, B:514:0x041c, B:515:0x044e, B:516:0x0459, B:518:0x045f, B:520:0x0466, B:521:0x046a, B:526:0x0483, B:533:0x0494, B:535:0x04be, B:536:0x04cd, B:537:0x04d8), top: B:549:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0301 A[Catch: all -> 0x0136, Exception -> 0x02be, OutOfMemoryError -> 0x02c1, TryCatch #2 {all -> 0x0136, blocks: (B:366:0x0105, B:376:0x013f, B:379:0x0146, B:390:0x0170, B:393:0x01a2, B:401:0x01cd, B:403:0x01e1, B:405:0x01e8, B:404:0x01e4, B:419:0x0207, B:421:0x021e, B:423:0x0245, B:425:0x024c, B:424:0x0248, B:448:0x0285, B:451:0x0298, B:453:0x02a1, B:464:0x02e4, B:466:0x0301, B:468:0x0308, B:467:0x0304, B:461:0x02c4, B:463:0x02e0, B:480:0x0326, B:486:0x0367, B:490:0x03a1, B:494:0x03ae, B:495:0x03b4, B:497:0x03ba, B:499:0x03c1, B:500:0x03c5, B:508:0x03e6, B:512:0x0411, B:514:0x041c, B:515:0x044e, B:516:0x0459, B:518:0x045f, B:520:0x0466, B:521:0x046a, B:526:0x0483, B:533:0x0494, B:535:0x04be, B:536:0x04cd, B:537:0x04d8), top: B:549:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0304 A[Catch: all -> 0x0136, Exception -> 0x02be, OutOfMemoryError -> 0x02c1, TryCatch #2 {all -> 0x0136, blocks: (B:366:0x0105, B:376:0x013f, B:379:0x0146, B:390:0x0170, B:393:0x01a2, B:401:0x01cd, B:403:0x01e1, B:405:0x01e8, B:404:0x01e4, B:419:0x0207, B:421:0x021e, B:423:0x0245, B:425:0x024c, B:424:0x0248, B:448:0x0285, B:451:0x0298, B:453:0x02a1, B:464:0x02e4, B:466:0x0301, B:468:0x0308, B:467:0x0304, B:461:0x02c4, B:463:0x02e0, B:480:0x0326, B:486:0x0367, B:490:0x03a1, B:494:0x03ae, B:495:0x03b4, B:497:0x03ba, B:499:0x03c1, B:500:0x03c5, B:508:0x03e6, B:512:0x0411, B:514:0x041c, B:515:0x044e, B:516:0x0459, B:518:0x045f, B:520:0x0466, B:521:0x046a, B:526:0x0483, B:533:0x0494, B:535:0x04be, B:536:0x04cd, B:537:0x04d8), top: B:549:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x04f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.o00Oo00 OooOo0o(int r33, com.google.android.gms.internal.ads.r40 r34, boolean r35, com.google.android.gms.internal.ads.o0O r36) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1641hg.OooOo0o(int, com.google.android.gms.internal.ads.r40, boolean, com.google.android.gms.internal.ads.o0O):com.google.android.gms.internal.ads.o00Oo00");
    }
}
