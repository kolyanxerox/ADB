package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public class oOo0o00 implements oo0o0Oo, InterfaceC1770kz {

    /* renamed from: OooOoO */
    public static final oO00Oo00 f22918OooOoO = new oO00Oo00(2);

    /* renamed from: OooOo */
    public Object f22919OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f22920OooOo0O;

    /* renamed from: OooOo0o */
    public int f22921OooOo0o;

    /* renamed from: OooOoO0 */
    public Object f22922OooOoO0;

    public /* synthetic */ oOo0o00(int i, C1599gb c1599gb, C1599gb c1599gb2) {
        this.f22920OooOo0O = 8;
        this.f22921OooOo0o = i;
        this.f22919OooOo = c1599gb;
        this.f22922OooOoO0 = c1599gb2;
    }

    public static oOo0o00 OooO0oO(long j, String str) {
        return new oOo0o00(Long.valueOf(j), str, 2);
    }

    public static oOo0o00 OooOOO0(String str, boolean z) {
        return new oOo0o00(Boolean.valueOf(z), str, 1);
    }

    public synchronized byte[] OooO(int i) {
        for (int i2 = 0; i2 < ((ArrayList) this.f22922OooOoO0).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f22922OooOoO0).get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f22921OooOo0o -= length;
                ((ArrayList) this.f22922OooOoO0).remove(i2);
                ((ArrayList) this.f22919OooOo).remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public int OooO00o() {
        int i = this.f22921OooOo0o;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object OooO0O0(int i) {
        SparseArray sparseArray;
        if (this.f22921OooOo0o == -1) {
            this.f22921OooOo0o = 0;
        }
        while (true) {
            int i2 = this.f22921OooOo0o;
            sparseArray = (SparseArray) this.f22919OooOo;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f22921OooOo0o--;
        }
        while (this.f22921OooOo0o < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f22921OooOo0o + 1)) {
            this.f22921OooOo0o++;
        }
        return sparseArray.valueAt(this.f22921OooOo0o);
    }

    public void OooO0OO(C1665i3 c1665i3) {
        synchronized (this.f22919OooOo) {
            try {
                if (((LinkedList) this.f22922OooOoO0).size() >= 10) {
                    zzo.zze("Queue is full, current size = " + ((LinkedList) this.f22922OooOoO0).size());
                    ((LinkedList) this.f22922OooOoO0).remove(0);
                }
                int i = this.f22921OooOo0o;
                this.f22921OooOo0o = i + 1;
                c1665i3.OooOO0o = i;
                synchronized (c1665i3.f19908OooO0oO) {
                    try {
                        int i2 = c1665i3.f19911OooOO0O;
                        int i3 = c1665i3.OooOO0o;
                        boolean z = c1665i3.f19905OooO0Oo;
                        int i4 = c1665i3.f19903OooO0O0;
                        if (!z) {
                            i4 = (i3 * i4) + (i2 * c1665i3.f19902OooO00o);
                        }
                        if (i4 > c1665i3.f19912OooOOO) {
                            c1665i3.f19912OooOOO = i4;
                        }
                    } finally {
                    }
                }
                ((LinkedList) this.f22922OooOoO0).add(c1665i3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00aa  */
    @Override // com.google.android.gms.internal.ads.oo0o0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.o0OO00O OooO0Oo(com.google.android.gms.internal.ads.o000000 r24, long r25) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oOo0o00.OooO0Oo(com.google.android.gms.internal.ads.o000000, long):com.google.android.gms.internal.ads.o0OO00O");
    }

    public synchronized void OooO0o(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f22919OooOo).add(bArr);
                int iBinarySearch = Collections.binarySearch((ArrayList) this.f22922OooOoO0, bArr, f22918OooOoO);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                ((ArrayList) this.f22922OooOoO0).add(iBinarySearch, bArr);
                this.f22921OooOo0o += length;
                synchronized (this) {
                    while (this.f22921OooOo0o > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f22919OooOo).remove(0);
                        ((ArrayList) this.f22922OooOoO0).remove(bArr2);
                        this.f22921OooOo0o -= bArr2.length;
                    }
                }
            }
        }
    }

    public void OooO0o0(Object obj, Object obj2) {
        int i = this.f22921OooOo0o + 1;
        Object[] objArr = (Object[]) this.f22919OooOo;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f22919OooOo = Arrays.copyOf(objArr, lm0.OooO0o(length, i2));
        }
        xh0.Oooo0o0(obj, obj2);
        Object[] objArr2 = (Object[]) this.f22919OooOo;
        int i3 = this.f22921OooOo0o;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f22921OooOo0o = i3 + 1;
    }

    public void OooO0oo(C1665i3 c1665i3) {
        synchronized (this.f22919OooOo) {
            try {
                Iterator it = ((LinkedList) this.f22922OooOoO0).iterator();
                while (it.hasNext()) {
                    C1665i3 c1665i32 = (C1665i3) it.next();
                    if (zzv.zzp().OooO0Oo().zzK()) {
                        if (!zzv.zzp().OooO0Oo().zzL() && !c1665i3.equals(c1665i32) && c1665i32.f19916OooOOo0.equals(c1665i3.f19916OooOOo0)) {
                            it.remove();
                            return;
                        }
                    } else if (!c1665i3.equals(c1665i32) && c1665i32.f19914OooOOOO.equals(c1665i3.f19914OooOOOO)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long OooOO0O(o000000 o000000Var) throws EOFException, InterruptedIOException {
        long j;
        o0000O00 o0000o00;
        o0000O0 o0000o02;
        long j2;
        int iOooO0OO;
        while (true) {
            long jZze = o000000Var.zze();
            j = o000000Var.f21646OooOo;
            long j3 = j - 6;
            o0000o00 = (o0000O00) this.f22922OooOoO0;
            o0000o02 = (o0000O0) this.f22919OooOo;
            if (jZze >= j3) {
                j2 = -6;
                break;
            }
            long jZze2 = o000000Var.zze();
            byte[] bArr = new byte[2];
            o000000Var.OooO0o(bArr, 0, 2, false);
            int i = ((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR);
            int i2 = this.f22921OooOo0o;
            if (i == i2) {
                j2 = -6;
                r40 r40Var = new r40(16);
                System.arraycopy(bArr, 0, r40Var.f23745OooO00o, 0, 2);
                byte[] bArr2 = r40Var.f23745OooO00o;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iOooO0OO = o000000Var.OooO0OO(bArr2, i4 + i3, 14 - i3)) != -1; i4 = 2) {
                    i3 += iOooO0OO;
                }
                r40Var.OooO(i3);
                o000000Var.f21651OooOoOO = 0;
                o000000Var.OooO0oO((int) (jZze2 - o000000Var.f21650OooOoO0), false);
                if (af0.Oooo00O(r40Var, o0000o02, i2, o0000o00)) {
                    break;
                }
            } else {
                o000000Var.f21651OooOoOO = 0;
                o000000Var.OooO0oO((int) (jZze2 - o000000Var.f21650OooOoO0), false);
            }
            o000000Var.OooO0oO(1, false);
        }
        if (o000000Var.zze() < j + j2) {
            return o0000o00.f21668OooO00o;
        }
        o000000Var.OooO0oO((int) (j - o000000Var.zze()), false);
        return o0000o02.f21666OooOO0;
    }

    public mn0 OooOO0o() {
        sm0 sm0Var = (sm0) this.f22922OooOoO0;
        if (sm0Var != null) {
            throw sm0Var.OooO00o();
        }
        mn0 mn0VarOooO0OO = mn0.OooO0OO(this.f22921OooOo0o, (Object[]) this.f22919OooOo, this);
        sm0 sm0Var2 = (sm0) this.f22922OooOoO0;
        if (sm0Var2 == null) {
            return mn0VarOooO0OO;
        }
        throw sm0Var2.OooO00o();
    }

    public Object OooOOO() {
        C2296z6 c2296z6 = (C2296z6) AbstractC2113u8.f24591OooO00o.get();
        Object obj = this.f22922OooOoO0;
        if (c2296z6 == null) {
            if (AbstractC2113u8.f24592OooO0O0.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        int i = this.f22921OooOo0o - 1;
        String str = (String) this.f22919OooOo;
        SharedPreferences sharedPreferences = c2296z6.f26096OooO00o;
        if (i == 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, zBooleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(zBooleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r1));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r1));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1770kz
    /* renamed from: zza */
    public void mo13701zza(Object obj) {
        h61 h61Var = (h61) obj;
        int i = w41.f25183o00ooo;
        int i2 = this.f22921OooOo0o;
        if (i2 == 1) {
            h61Var.f19573OooO = false;
            i2 = 1;
        }
        b61 b61Var = h61Var.f19580OooO0oO;
        b61Var.getClass();
        s20 s20Var = h61Var.f19577OooO0Oo;
        s20Var.f23979OooOoO0 = s20.OooOOO(b61Var, (rm0) s20Var.f23977OooOo0o, (h91) s20Var.f23978OooOoO, (C1528ee) s20Var.f23976OooOo0O);
        d61 d61VarOooO0oO = h61Var.OooO0oO();
        h61Var.OooO(d61VarOooO0oO, 11, new Oooo0oO.o0000Ooo(d61VarOooO0oO, i2, (C1599gb) this.f22919OooOo, (C1599gb) this.f22922OooOoO0));
    }

    @Override // com.google.android.gms.internal.ads.oo0o0Oo
    public void zzb() {
        switch (this.f22920OooOo0O) {
            case 1:
                break;
            default:
                byte[] bArr = i80.f19998OooO0o;
                int length = bArr.length;
                ((r40) this.f22922OooOoO0).OooO0oo(0, bArr);
                break;
        }
    }

    public oOo0o00(o0000O0 o0000o02, int i) {
        this.f22920OooOo0O = 1;
        this.f22919OooOo = o0000o02;
        this.f22921OooOo0o = i;
        this.f22922OooOoO0 = new o0000O00();
    }

    public oOo0o00(pb1 pb1Var, z71 z71Var, int i, long j) {
        this.f22920OooOo0O = 10;
        this.f22919OooOo = z71Var;
        this.f22921OooOo0o = i;
        this.f22922OooOoO0 = pb1Var;
    }

    public /* synthetic */ oOo0o00(com.google.android.gms.internal.measurement.o0OOO00 o0ooo00, byte[] bArr) {
        this.f22920OooOo0O = 5;
        this.f22922OooOoO0 = o0ooo00;
        this.f22919OooOo = bArr;
    }

    public oOo0o00(Object obj, String str, int i) {
        this.f22920OooOo0O = 6;
        this.f22919OooOo = str;
        this.f22922OooOoO0 = obj;
        this.f22921OooOo0o = i;
    }

    public oOo0o00(int i, byte b) {
        this.f22920OooOo0O = i;
        switch (i) {
            case 4:
                this.f22919OooOo = new Object();
                this.f22922OooOoO0 = new LinkedList();
                break;
            default:
                this.f22919OooOo = new ArrayList();
                this.f22922OooOoO0 = new ArrayList(64);
                this.f22921OooOo0o = 0;
                break;
        }
    }

    public oOo0o00(int i, h70 h70Var) {
        this.f22920OooOo0O = 2;
        this.f22921OooOo0o = i;
        this.f22919OooOo = h70Var;
        this.f22922OooOoO0 = new r40();
    }

    public oOo0o00(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        this.f22920OooOo0O = 3;
        this.f22921OooOo0o = i2;
        this.f22919OooOo = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f22922OooOoO0 = bArr;
    }

    public oOo0o00(int i) {
        this.f22920OooOo0O = 7;
        this.f22919OooOo = new Object[i + i];
        this.f22921OooOo0o = 0;
    }

    public oOo0o00(g61 g61Var) {
        this.f22920OooOo0O = 9;
        this.f22919OooOo = new SparseArray();
        this.f22922OooOoO0 = g61Var;
        this.f22921OooOo0o = -1;
    }

    private final /* synthetic */ void OooOO0() {
    }
}
