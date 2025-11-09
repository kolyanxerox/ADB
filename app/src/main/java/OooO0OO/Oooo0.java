package OooO0oO;

import OooOooo.o000Oo0;
import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.C1548ey;
import com.google.android.gms.internal.ads.C1808m;
import com.google.android.gms.internal.ads.C1923p3;
import com.google.android.gms.internal.ads.C1956q;
import com.google.android.gms.internal.ads.C1960q3;
import com.google.android.gms.internal.ads.O0O0;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.eg0;
import com.google.android.gms.internal.ads.ij0;
import com.google.android.gms.internal.ads.j81;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.o000000;
import com.google.android.gms.internal.ads.o0O0OOO0;
import com.google.android.gms.internal.ads.oO00Oo00;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.s50;
import com.google.android.gms.internal.ads.vp0;
import com.google.android.gms.internal.ads.zd0;
import com.google.android.gms.internal.ads.ze0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import o00OO.OooO00o;
import o00OO.OooO0O0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes.dex */
public final class Oooo0 implements vp0, Continuation, j81 {

    /* renamed from: OooOo */
    public Object f13283OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13284OooOo0O;

    /* renamed from: OooOo0o */
    public int f13285OooOo0o;

    public /* synthetic */ Oooo0(Object obj, int i, int i2) {
        this.f13284OooOo0O = i2;
        this.f13283OooOo = obj;
        this.f13285OooOo0o = i;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public String OooO(ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r3 = 0;
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        PriorityQueue priorityQueue = new PriorityQueue(this.f13285OooOo0o, new oO00Oo00(3));
        int i2 = 0;
        while (i2 < strArrSplit.length) {
            String[] strArrOooOoO0 = af0.OooOoO0(strArrSplit[i2], r3);
            if (strArrOooOoO0.length != 0) {
                int length = strArrOooOoO0.length;
                int i3 = this.f13285OooOo0o;
                if (length < 6) {
                    ze0.Oooo0o(i3, ze0.Oooo(strArrOooOoO0, length), ze0.OooOoO(strArrOooOoO0, r3, length), length, priorityQueue);
                } else {
                    long jOooo = ze0.Oooo(strArrOooOoO0, 6);
                    ze0.Oooo0o(i3, jOooo, ze0.OooOoO(strArrOooOoO0, r3, 6), 6, priorityQueue);
                    int i4 = 1;
                    while (true) {
                        int length2 = strArrOooOoO0.length;
                        if (i4 < length2 - 5) {
                            int iOooO0OO = af0.OooO0OO(strArrOooOoO0[i4 - 1]);
                            int iOooO0OO2 = af0.OooO0OO(strArrOooOoO0[i4 + 5]);
                            int i5 = i4;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            String strOooOoO = ze0.OooOoO(strArrOooOoO0, i5, 6);
                            jOooo = (((iOooO0OO2 + 2147483647L) % 1073807359) + (((((jOooo + 1073807359) - ((((iOooO0OO + 2147483647L) % 1073807359) * ze0.OooO0o0(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                            ze0.Oooo0o(i3, jOooo, strOooOoO, length2, priorityQueue);
                            i4 = i5 + 1;
                            strArrSplit = strArrSplit;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    }
                }
            }
            i2++;
            strArrSplit = strArrSplit;
            byteArrayOutputStream = byteArrayOutputStream;
            r3 = 0;
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((C1923p3) this.f13283OooOo).o00000oo(((C1960q3) it.next()).f23496OooO0O0));
            } catch (IOException e) {
                zzo.zzh("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream3.close();
            return byteArrayOutputStream3.toString();
        } catch (IOException e3) {
            zzo.zzh("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean OooO00o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean OooO0O0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public void OooO0OO(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f13283OooOo;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            kotlin.jvm.internal.OooOo.OooO0Oo(cArrCopyOf, "copyOf(...)");
            this.f13283OooOo = cArrCopyOf;
        }
    }

    public synchronized void OooO0Oo() {
        this.f13285OooOo0o++;
    }

    public void OooO0o() {
        OooO0O0 oooO0O0 = OooO0O0.f31858OooO0OO;
        char[] array = (char[]) this.f13283OooOo;
        oooO0O0.getClass();
        kotlin.jvm.internal.OooOo.OooO0o0(array, "array");
        synchronized (oooO0O0) {
            int i = oooO0O0.f21616OooO00o;
            if (array.length + i < OooO00o.f31857OooO00o) {
                oooO0O0.f21616OooO00o = i + array.length;
                ((o00O0.OooOOO0) oooO0O0.f21617OooO0O0).addLast(array);
            }
        }
    }

    public int OooO0o0() {
        if ((this.f13285OooOo0o & 128) != 0) {
            return ((int[]) this.f13283OooOo)[7];
        }
        return 65535;
    }

    public void OooO0oO(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f13283OooOo;
            if (i >= iArr.length) {
                return;
            }
            this.f13285OooOo0o = (1 << i) | this.f13285OooOo0o;
            iArr[i] = i2;
        }
    }

    public void OooO0oo(String text) {
        kotlin.jvm.internal.OooOo.OooO0o0(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        OooO0OO(this.f13285OooOo0o, length);
        text.getChars(0, text.length(), (char[]) this.f13283OooOo, this.f13285OooOo0o);
        this.f13285OooOo0o += length;
    }

    public long OooOO0(int i) {
        if (i < 0 || i >= this.f13285OooOo0o) {
            throw new IndexOutOfBoundsException(OooOo.OooO0o0(i, this.f13285OooOo0o, "Invalid index ", ", size is "));
        }
        return ((long[]) this.f13283OooOo)[i];
    }

    public long OooOO0O(o000000 o000000Var) {
        int i;
        r40 r40Var = (r40) this.f13283OooOo;
        int i2 = 0;
        o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 1, false);
        int i3 = r40Var.f23745OooO00o[0] & ForkServer.ERROR;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        o000000Var.OooO0o(r40Var.f23745OooO00o, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (r40Var.f23745OooO00o[i2] & ForkServer.ERROR) + (i6 << 8);
        }
        this.f13285OooOo0o += i;
        return i6;
    }

    public void OooOO0o(long j) {
        int i = this.f13285OooOo0o;
        long[] jArr = (long[]) this.f13283OooOo;
        if (i == jArr.length) {
            this.f13283OooOo = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.f13283OooOo;
        int i2 = this.f13285OooOo0o;
        this.f13285OooOo0o = i2 + 1;
        jArr2[i2] = j;
    }

    public void OooOOO0(long[] jArr) {
        int i = this.f13285OooOo0o;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArr2 = (long[]) this.f13283OooOo;
        int length2 = jArr2.length;
        if (i2 > length2) {
            this.f13283OooOo = Arrays.copyOf(jArr2, Math.max(length2 + length2, i2));
        }
        System.arraycopy(jArr, 0, (long[]) this.f13283OooOo, this.f13285OooOo0o, length);
        this.f13285OooOo0o = i2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        ij0 ij0Var = (ij0) task.getResult();
        byte[] bArrOooO0Oo = ((C1956q) ((C1808m) this.f13283OooOo).OooO0O0()).OooO0Oo();
        ij0Var.getClass();
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0(ij0Var, bArrOooO0Oo);
        o0o0ooo0.f21962OooO0O0 = this.f13285OooOo0o;
        o0o0ooo0.OooO0Oo();
        return Boolean.TRUE;
    }

    public String toString() {
        switch (this.f13284OooOo0O) {
            case 12:
                return new String((char[]) this.f13283OooOo, 0, this.f13285OooOo0o);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.j81
    public int zza() {
        if (((MediaCodecInfo[]) this.f13283OooOo) == null) {
            this.f13283OooOo = new MediaCodecList(this.f13285OooOo0o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f13283OooOo).length;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public MediaCodecInfo zzb(int i) {
        if (((MediaCodecInfo[]) this.f13283OooOo) == null) {
            this.f13283OooOo = new MediaCodecList(this.f13285OooOo0o).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f13283OooOo)[i];
    }

    @Override // com.google.android.gms.internal.ads.j81
    public boolean zze() {
        return true;
    }

    public Oooo0(boolean z, boolean z2) {
        this.f13284OooOo0O = 8;
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f13285OooOo0o = i;
    }

    public Oooo0(int i, byte b) {
        this.f13284OooOo0O = i;
        switch (i) {
            case 9:
                this.f13285OooOo0o = 0;
                break;
            case 10:
            case 11:
            default:
                this.f13283OooOo = new r40(8);
                break;
            case 12:
                break;
            case 13:
                this.f13283OooOo = new int[10];
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        zzv.zzp().OooO0oo("BufferingUrlPinger.attributionReportingManager", th);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        String str = (String) obj;
        zd0 zd0Var = (zd0) this.f13283OooOo;
        kd0 kd0Var = zd0Var.f26149OooO00o;
        if (!kd0Var.f20543OoooooO) {
            zd0Var.f26151OooO0OO.OooO0O0(str, kd0Var.f20552o0OOO0o, zd0Var.f26154OooO0o0);
            return;
        }
        String str2 = zd0Var.f26150OooO0O0.f21205OooO0O0;
        eg0 eg0Var = zd0Var.f26152OooO0Oo;
        eg0Var.getClass();
        ((oo000o) zzv.zzC()).getClass();
        O0O0 o0o0 = new O0O0(System.currentTimeMillis(), str2, str, this.f13285OooOo0o);
        s50 s50Var = eg0Var.f18606OooO00o;
        s50Var.getClass();
        s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
    }

    public Oooo0(int i, int i2) {
        this.f13284OooOo0O = i2;
        switch (i2) {
            case 4:
                this.f13283OooOo = new long[i];
                break;
            default:
                this.f13283OooOo = new C1923p3(2);
                this.f13285OooOo0o = i;
                break;
        }
    }

    public Oooo0(o000Oo0 o000oo02, int i) {
        this.f13284OooOo0O = 1;
        o000000O.OooO0oo(o000oo02);
        this.f13283OooOo = o000oo02;
        this.f13285OooOo0o = i;
    }

    public Oooo0(int i, String str) {
        this.f13284OooOo0O = 10;
        this.f13285OooOo0o = i;
        this.f13283OooOo = str;
    }
}
