package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.measurement.C2337f0;
import com.ironsource.C3007ch;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ai */
/* loaded from: classes2.dex */
public class C1386ai implements OooOOoo.o0000O, ooo0Oo0, InterfaceC1427bm, vp0, InterfaceC1961q4, InterfaceC2064sx, cf0, o0000Oo.oo000o, o000o0O0.OooOOO0, o000oo0O.o0O0O00 {

    /* renamed from: OooOoOO */
    public static InterfaceC1499dl f17041OooOoOO;

    /* renamed from: OooOo */
    public Object f17042OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17043OooOo0O;

    /* renamed from: OooOo0o */
    public Object f17044OooOo0o;

    /* renamed from: OooOoO */
    public Object f17045OooOoO;

    /* renamed from: OooOoO0 */
    public Object f17046OooOoO0;

    public /* synthetic */ C1386ai(int i, boolean z) {
        this.f17043OooOo0O = i;
    }

    public static InterfaceC1499dl OooOOOO(Context context) {
        InterfaceC1499dl interfaceC1499dl;
        synchronized (C1386ai.class) {
            try {
                if (f17041OooOoOO == null) {
                    f17041OooOoOO = zzbc.zza().zzt(context, new BinderC2082te());
                }
                interfaceC1499dl = f17041OooOoOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1499dl;
    }

    public File OooO(Context context) {
        ((o000OOoO.OooO) this.f17042OooOo).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    @Override // o000oo0O.o0O0O00
    public void OooO00o(Serializable serializable) {
        this.f17044OooOo0o = serializable;
    }

    @Override // o0000Oo.oo000o
    public synchronized void OooO0O0(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != ((o0000Oo.OooOO0O) this.f17045OooOoO).OooO0o0()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        if (byteBuffer.get() != ((o0000Oo.OooOO0O) this.f17045OooOoO).OooO0o0()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f17046OooOoO0 = new byte[7];
        byte[] bArr2 = new byte[((o0000Oo.OooOO0O) this.f17045OooOoO).f29445OooO00o];
        byteBuffer.get(bArr2);
        byteBuffer.get((byte[]) this.f17046OooOoO0);
        o0000Oo.OooOO0O oooOO0O = (o0000Oo.OooOO0O) this.f17045OooOoO;
        this.f17044OooOo0o = new SecretKeySpec(Oooo0oO.o00000.OooO0O0(oooOO0O.f29448OooO0Oo, oooOO0O.f29449OooO0o0, bArr2, bArr, oooOO0O.f29445OooO00o), "AES");
        this.f17042OooOo = (Cipher) o0000Oo.Oooo0.f29463OooO0O0.f29465OooO00o.OooO00o("AES/GCM/NoPadding");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x007b, code lost:
    
        r8.OooO(r0);
        r0 = true;
     */
    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OooO0OO(int r35, int r36, OooOOOO.OooO0O0 r37, byte[] r38) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1386ai.OooO0OO(int, int, OooOOOO.OooO0O0, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1961q4
    public void OooO0Oo(C1889o6 c1889o6) {
        C2072t4 c2072t4 = (C2072t4) ((C1926p6) c1889o6.f25822OooOo0o).OooOooo().OooOO0o();
        c2072t4.OooO0Oo();
        C2109u4.OooOo0o((C2109u4) c2072t4.f25822OooOo0o, (EnumC2035s4) this.f17044OooOo0o);
        c1889o6.OooO0Oo();
        C1926p6.OooOoO0((C1926p6) c1889o6.f25822OooOo0o, (C2109u4) c2072t4.OooO0O0());
        C1741k6 c1741k6 = (C1741k6) ((C1926p6) c1889o6.f25822OooOo0o).Oooo000().OooOO0o();
        c1741k6.OooO0Oo();
        C1778l6.OooOo0o((C1778l6) c1741k6.f25822OooOo0o, (String) this.f17045OooOoO);
        C1740k5 c1740k5 = (C1740k5) this.f17042OooOo;
        c1741k6.OooO0Oo();
        C1778l6.OooOo((C1778l6) c1741k6.f25822OooOo0o, c1740k5);
        c1889o6.OooO0Oo();
        C1926p6.OooOoOO((C1926p6) c1889o6.f25822OooOo0o, (C1778l6) c1741k6.OooO0O0());
        c1889o6.OooO0Oo();
        C1926p6.OooOoo((C1926p6) c1889o6.f25822OooOo0o, (String) this.f17046OooOoO0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) throws C2027rx {
        boolean zOooOOO0;
        try {
            int iOrdinal = ((AdFormat) this.f17042OooOo).ordinal();
            InterfaceC1530eg interfaceC1530eg = (InterfaceC1530eg) this.f17046OooOoO0;
            if (iOrdinal == 1) {
                zOooOOO0 = interfaceC1530eg.OooOOO0(new Oooo0o.OooO0OO(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zOooOOO0 = interfaceC1530eg.OooOO0o(new Oooo0o.OooO0OO(context));
                    }
                    throw new C2027rx("Adapter failed to show.");
                }
                zOooOOO0 = interfaceC1530eg.o0000o0O(new Oooo0o.OooO0OO(context));
            }
            if (zOooOOO0) {
                C2320zu c2320zu = (C2320zu) this.f17045OooOoO;
                if (c2320zu == null) {
                    return;
                }
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17805o000O)).booleanValue() || ((kd0) this.f17044OooOo0o).f20533OoooOo0 != 2) {
                    return;
                }
                c2320zu.zza();
                return;
            }
            throw new C2027rx("Adapter failed to show.");
        } catch (Throwable th) {
            throw new C2027rx(th);
        }
    }

    @Override // o000oo0O.o0O0O00
    public void OooO0o0(String str, HashMap map) {
        this.f17045OooOoO = "sqlite_error";
        this.f17042OooOo = str;
        this.f17046OooOoO0 = map;
    }

    @Override // o0000Oo.oo000o
    public synchronized void OooO0oO(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        ((Cipher) this.f17042OooOo).init(2, (SecretKeySpec) this.f17044OooOo0o, o0000Oo.OooOO0O.OooO((byte[]) this.f17046OooOoO0, i, z));
        ((Cipher) this.f17042OooOo).doFinal(byteBuffer, byteBuffer2);
    }

    public o0000.OooOO0 OooO0oo() throws GeneralSecurityException {
        o000Ooo0.OooOO0 oooOO0;
        o0000.OooOo00 oooOo00 = (o0000.OooOo00) this.f17044OooOo0o;
        if (oooOo00 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        o000Ooo0.OooOO0 oooOO02 = (o000Ooo0.OooOO0) this.f17042OooOo;
        if (oooOO02 == null || (oooOO0 = (o000Ooo0.OooOO0) this.f17046OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (oooOo00.f28930OooO0O0 != ((o0000OoO.o00OOO0O) oooOO02.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (oooOo00.f28931OooO0OO != ((o0000OoO.o00OOO0O) oooOO0.f30538OooOo0o).f29522OooO00o.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        o0000.OooOOOO oooOOOO = o0000.OooOOOO.f28910OooOO0;
        o0000.OooOOOO oooOOOO2 = oooOo00.f28934OooO0o0;
        if (oooOOOO2 != oooOOOO && ((Integer) this.f17045OooOoO) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (oooOOOO2 == oooOOOO && ((Integer) this.f17045OooOoO) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (oooOOOO2 == oooOOOO) {
            o0000OoO.o00OOO0O.OooO00o(new byte[0]);
        } else if (oooOOOO2 == o0000.OooOOOO.f28903OooO) {
            o0000OoO.o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f17045OooOoO).intValue()).array());
        } else {
            if (oooOOOO2 != o0000.OooOOOO.f28909OooO0oo) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((o0000.OooOo00) this.f17044OooOo0o).f28934OooO0o0);
            }
            o0000OoO.o00OOO0O.OooO00o(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f17045OooOoO).intValue()).array());
        }
        return new o0000.OooOO0();
    }

    public void OooOO0(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        if (((OooOOo0.o0ooOOo) this.f17045OooOoO) != null) {
            Log.m13457d(FlutterJNI.TAG, str2);
        }
    }

    public void OooOO0O(o000OO.OooO00o oooO00o) throws GeneralSecurityException {
        oooO00o.getClass();
        o000OO.o00Oo0 o00oo0 = new o000OO.o00Oo0(o000OO.o0OoOo0.class, oooO00o.f30158OooO00o);
        HashMap map = (HashMap) this.f17042OooOo;
        if (!map.containsKey(o00oo0)) {
            map.put(o00oo0, oooO00o);
            return;
        }
        o000OO.OooO00o oooO00o2 = (o000OO.OooO00o) map.get(o00oo0);
        if (oooO00o2.equals(oooO00o) && oooO00o.equals(oooO00o2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + o00oo0);
    }

    public void OooOO0o(o000OO.OooO0OO oooO0OO) throws GeneralSecurityException {
        o000OO.o00Ooo o00ooo2 = new o000OO.o00Ooo(oooO0OO.f30160OooO00o, o000OO.o0OoOo0.class);
        HashMap map = (HashMap) this.f17044OooOo0o;
        if (!map.containsKey(o00ooo2)) {
            map.put(o00ooo2, oooO0OO);
            return;
        }
        o000OO.OooO0OO oooO0OO2 = (o000OO.OooO0OO) map.get(o00ooo2);
        if (oooO0OO2.equals(oooO0OO) && oooO0OO.equals(oooO0OO2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + o00ooo2);
    }

    public void OooOOO(o000OO.OooOo00 oooOo00) throws GeneralSecurityException {
        o000OO.o00Ooo o00ooo2 = new o000OO.o00Ooo(oooOo00.f30173OooO00o, o000OO.o00O0O.class);
        HashMap map = (HashMap) this.f17046OooOoO0;
        if (!map.containsKey(o00ooo2)) {
            map.put(o00ooo2, oooOo00);
            return;
        }
        o000OO.OooOo00 oooOo002 = (o000OO.OooOo00) map.get(o00ooo2);
        if (oooOo002.equals(oooOo00) && oooOo00.equals(oooOo002)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + o00ooo2);
    }

    public void OooOOO0(o000OO.OooOOOO oooOOOO) throws GeneralSecurityException {
        oooOOOO.getClass();
        o000OO.o00Oo0 o00oo0 = new o000OO.o00Oo0(o000OO.o00O0O.class, oooOOOO.f30170OooO00o);
        HashMap map = (HashMap) this.f17045OooOoO;
        if (!map.containsKey(o00oo0)) {
            map.put(o00oo0, oooOOOO);
            return;
        }
        o000OO.OooOOOO oooOOOO2 = (o000OO.OooOOOO) map.get(o00oo0);
        if (oooOOOO2.equals(oooOOOO) && oooOOOO.equals(oooOOOO2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + o00oo0);
    }

    public com.google.android.gms.internal.measurement.Oooo0 OooOOOo(C2051sk c2051sk, com.google.android.gms.internal.measurement.o0OO000o... o0oo000oArr) {
        com.google.android.gms.internal.measurement.Oooo0 oooo0Oooo00O = com.google.android.gms.internal.measurement.Oooo0.OooOO0o;
        for (com.google.android.gms.internal.measurement.o0OO000o o0oo000o : o0oo000oArr) {
            oooo0Oooo00O = o000O00.o00O0O0O.Oooo00O(o0oo000o);
            o00O0.o000OOo.OooOo((C2051sk) this.f17046OooOoO0);
            if ((oooo0Oooo00O instanceof com.google.android.gms.internal.measurement.o000oOoO) || (oooo0Oooo00O instanceof com.google.android.gms.internal.measurement.Oooo000)) {
                oooo0Oooo00O = ((com.google.android.gms.internal.measurement.oo000o) this.f17044OooOo0o).OooO0OO(c2051sk, oooo0Oooo00O);
            }
        }
        return oooo0Oooo00O;
    }

    public void OooOOo(int i) {
        switch (this.f17043OooOo0O) {
            case 17:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f17044OooOo0o = Integer.valueOf(i);
                return;
            default:
                this.f17044OooOo0o = Integer.valueOf(i);
                return;
        }
    }

    public void OooOOoo(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f17044OooOo0o;
        InterfaceC1499dl interfaceC1499dlOooOOOO = OooOOOO(context);
        if (interfaceC1499dlOooOOOO == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(context);
        zzei zzeiVar = (zzei) this.f17046OooOoO0;
        if (zzeiVar == null) {
            zzn zznVar = new zzn();
            zznVar.zzg(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzeiVar.zzq(jCurrentTimeMillis);
            zzmVarZza = zzr.zza.zza(context, zzeiVar);
        }
        zzm zzmVar = zzmVarZza;
        try {
            interfaceC1499dlOooOOOO.zzf(oooO0OO, new C1646hl((String) this.f17045OooOoO, ((AdFormat) this.f17042OooOo).name(), null, zzmVar, 0, null), new BinderC2307zh(queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    public xr0 OooOo() throws GeneralSecurityException {
        Integer num = (Integer) this.f17044OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f17042OooOo) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f17046OooOoO0) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f17042OooOo).getClass();
        ((Integer) this.f17046OooOoO0).getClass();
        return new xr0(iIntValue, (tq0) this.f17045OooOoO);
    }

    public void OooOo0(int i) {
        this.f17042OooOo = Integer.valueOf(i);
    }

    public void OooOo00() {
        this.f17046OooOoO0 = 16;
    }

    public C1619gv OooOo0O(Set set) {
        return new C1619gv(set);
    }

    public kr0 OooOo0o() throws GeneralSecurityException {
        pd0 pd0Var;
        az0 az0VarOooO0O0;
        qr0 qr0Var = (qr0) this.f17044OooOo0o;
        if (qr0Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        pd0 pd0Var2 = (pd0) this.f17042OooOo;
        if (pd0Var2 == null || (pd0Var = (pd0) this.f17046OooOoO0) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (qr0Var.f23683OooO00o != ((az0) pd0Var2.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (qr0Var.f23684OooO0O0 != ((az0) pd0Var.f23325OooOo0o).f17140OooO00o.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (qr0Var.OooO00o() && ((Integer) this.f17045OooOoO) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((qr0) this.f17044OooOo0o).OooO00o() && ((Integer) this.f17045OooOoO) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        pr0 pr0Var = ((qr0) this.f17044OooOo0o).f23688OooO0o0;
        if (pr0Var == pr0.f23413OooO0o0) {
            az0VarOooO0O0 = gu0.f19473OooO00o;
        } else if (pr0Var == pr0.f23411OooO0Oo) {
            az0VarOooO0O0 = gu0.OooO00o(((Integer) this.f17045OooOoO).intValue());
        } else {
            if (pr0Var != pr0.f23410OooO0OO) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((qr0) this.f17044OooOo0o).f23688OooO0o0)));
            }
            az0VarOooO0O0 = gu0.OooO0O0(((Integer) this.f17045OooOoO).intValue());
        }
        return new kr0((qr0) this.f17044OooOo0o, (pd0) this.f17042OooOo, (pd0) this.f17046OooOoO0, az0VarOooO0O0, (Integer) this.f17045OooOoO);
    }

    public o00000oO.OooOOO OooOoO(final int i, final long j, final String str) {
        final String strOooOoo;
        zzx zzxVar = (zzx) this.f17044OooOo0o;
        if (i > zzxVar.zzc()) {
            eg0 eg0Var = (eg0) this.f17045OooOoO;
            if (eg0Var == null || !zzxVar.zzd()) {
                return ii0.OooooOO(zzt.zzc);
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            O0O0 o0o0 = new O0O0(System.currentTimeMillis(), "", str, 2);
            s50 s50Var = eg0Var.f18606OooO00o;
            s50Var.getClass();
            s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
            return ii0.OooooOO(zzt.zzd);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OO0Ooo)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i));
            strOooOoo = OooO0oO.OooOo.OooOoo(String.valueOf(builderClearQuery.build()), C3034d9.i.f8175c, encodedQuery);
        } else {
            strOooOoo = str;
        }
        lp0 lp0Var = new lp0() { // from class: com.google.android.gms.internal.ads.dg0
            @Override // com.google.android.gms.internal.ads.lp0
            public final o00000oO.OooOOO zza(Object obj) {
                zzt zztVar = (zzt) obj;
                zzt zztVar2 = zzt.zzc;
                C1386ai c1386ai = this.f18247OooO00o;
                if (zztVar != zztVar2) {
                    c1386ai.getClass();
                    return ii0.OooooOO(zztVar);
                }
                zzx zzxVar2 = (zzx) c1386ai.f17044OooOo0o;
                long jZzb = zzxVar2.zzb();
                int i2 = i;
                if (i2 != 1) {
                    jZzb = (long) (zzxVar2.zza() * j);
                }
                return c1386ai.OooOoO(i2 + 1, jZzb, str);
            }
        };
        cq0 cq0Var = (dq0) this.f17046OooOoO0;
        if (j == 0) {
            final int i2 = 1;
            return ii0.ooOO(((C2163vl) cq0Var).OooO0O0(new Callable(this) { // from class: com.google.android.gms.internal.ads.cg0

                /* renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C1386ai f17997OooOo0o;

                {
                    this.f17997OooOo0o = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i2) {
                    }
                    return ((zzu) this.f17997OooOo0o.f17042OooOo).zza(strOooOoo);
                }
            }), lp0Var, cq0Var);
        }
        final int i3 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.cg0

            /* renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C1386ai f17997OooOo0o;

            {
                this.f17997OooOo0o = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i3) {
                }
                return ((zzu) this.f17997OooOo0o.f17042OooOo).zza(strOooOoo);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hq0 hq0Var = (hq0) cq0Var;
        hq0Var.getClass();
        nq0 nq0Var = new nq0(callable);
        return ii0.ooOO(new fq0(nq0Var, hq0Var.f19839OooOo.schedule(nq0Var, j, timeUnit)), lp0Var, cq0Var);
    }

    public jv0 OooOoO0() {
        Integer num = (Integer) this.f17044OooOo0o;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f17042OooOo) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((hv0) this.f17046OooOoO0) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f17044OooOo0o));
        }
        Integer num2 = (Integer) this.f17042OooOo;
        int iIntValue = num2.intValue();
        hv0 hv0Var = (hv0) this.f17046OooOoO0;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (hv0Var == hv0.f19868OooO0O0) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (hv0Var == hv0.f19869OooO0OO) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (hv0Var == hv0.f19870OooO0Oo) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (hv0Var == hv0.f19872OooO0o0) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (hv0Var != hv0.f19871OooO0o) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new jv0(((Integer) this.f17044OooOo0o).intValue(), ((Integer) this.f17042OooOo).intValue(), (iv0) this.f17045OooOoO, (hv0) this.f17046OooOoO0);
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        switch (this.f17043OooOo0O) {
            case 2:
                return new OooOo0o.o0OoOo0((Executor) ((o00O00oO.o0000O0) this.f17044OooOo0o).get(), (OooOo.OooO0o) ((o00O00oO.o0000O0) this.f17042OooOo).get(), (OooOo0o.OooOOO0) ((Oooo.OooOo00) this.f17046OooOoO0).get(), (OooOoO0.o0O0O00) ((o00O00oO.o0000O0) this.f17045OooOoO).get());
            default:
                return new o000o00o.o0OOO0o((o0000o0.Oooo0) ((o000o0O0.OooOOO) this.f17044OooOo0o).get(), (o000o0O.oo000o) ((o000o0O0.OooOOO) this.f17042OooOo).get(), (o00O0O0O.OooOOO0) ((o000o0O0.OooOOO) this.f17046OooOoO0).get(), (o000o00o.o00oOoo) ((o000o0O0.OooOOO) this.f17045OooOoO).get());
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    /* renamed from: zza */
    public void mo13703zza() {
        switch (this.f17043OooOo0O) {
            case 12:
                ((p60) ((l80) this.f17044OooOo0o).f20828OooO0o0).OooO0O0((rd0) this.f17042OooOo, (kd0) this.f17046OooOoO0, (l60) this.f17045OooOoO);
                break;
            default:
                this.f17042OooOo = 12;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        mf0 mf0Var;
        switch (this.f17043OooOo0O) {
            case 7:
                ((AbstractC1870no) this.f17046OooOoO0).OoooO0((Map) obj, (List) this.f17044OooOo0o, (String) this.f17045OooOoO);
                return;
            case 13:
                AbstractC1433bs abstractC1433bs = (AbstractC1433bs) obj;
                synchronized (((jc0) this.f17045OooOoO)) {
                    try {
                        jc0 jc0Var = (jc0) this.f17045OooOoO;
                        if (jc0Var.f20284OooOOO0) {
                            jc0Var.OooO0OO();
                        }
                        if (!((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() || (mf0Var = (mf0) this.f17044OooOo0o) == null) {
                            nf0 nf0Var = ((jc0) this.f17045OooOoO).f20272OooO;
                            jf0 jf0Var = (jf0) this.f17042OooOo;
                            jf0Var.OooO0OO(abstractC1433bs.f17099OooO00o.f23849OooO0O0);
                            jf0Var.OooO0o(abstractC1433bs.f17103OooO0o.f23118OooOo0O);
                            jf0Var.OooOO0(true);
                            nf0Var.OooO0O0(jf0Var.zzm());
                        } else {
                            mf0Var.OooO0oO(abstractC1433bs.f17099OooO00o.f23849OooO0O0);
                            mf0Var.OooO0o0(abstractC1433bs.f17103OooO0o.f23118OooOo0O);
                            jf0 jf0Var2 = (jf0) this.f17042OooOo;
                            jf0Var2.OooOO0(true);
                            mf0Var.OooO00o(jf0Var2);
                            mf0Var.OooO0oo();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                String str = (String) obj;
                kd0 kd0VarOooO0OO = ((InterfaceC1722jo) this.f17044OooOo0o).OooO0OO();
                if (kd0VarOooO0OO != null && !kd0VarOooO0OO.f20543OoooooO) {
                    com.google.android.gms.ads.internal.util.client.zzv zzvVar = kd0VarOooO0OO.f20552o0OOO0o;
                    if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOooOo)).booleanValue() || ((C1468cr) this.f17042OooOo) == null || !C1468cr.OooO0O0(str)) {
                        ((hg0) this.f17046OooOoO0).OooO0O0(str, zzvVar, null);
                        return;
                    }
                    C1468cr c1468cr = (C1468cr) this.f17042OooOo;
                    hg0 hg0Var = (hg0) this.f17046OooOoO0;
                    Random randomZze = zzbc.zze();
                    c1468cr.getClass();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    o00000oO.OooOOO oooOOOO00Oo0 = ii0.o00Oo0(c1468cr.OooO0OO(str, c1468cr.f18047OooO0Oo.f23479OooO00o, randomZze), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0OO0)).intValue(), TimeUnit.MILLISECONDS, c1468cr.f18050OooO0oO);
                    oooOOOO00Oo0.addListener(new wp0(0, oooOOOO00Oo0, new C2051sk(c1468cr, hg0Var, str, zzvVar, 8, false)), c1468cr.f18049OooO0o0);
                    return;
                }
                md0 md0VarO0ooOoO = ((InterfaceC1722jo) this.f17044OooOo0o).o0ooOoO();
                if (md0VarO0ooOoO == null) {
                    zzv.zzp().OooO0oo("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean zOooO00o = zzv.zzp().OooO00o(((InterfaceC1722jo) this.f17044OooOo0o).getContext());
                boolean z = false;
                boolean z2 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooo0)).booleanValue() && kd0VarOooO0OO != null && kd0VarOooO0OO.f20529OoooO0O;
                if (kd0VarOooO0OO != null && kd0VarOooO0OO.f20538OooooO0 != null) {
                    z = true;
                }
                O0O0 o0o0 = new O0O0(jCurrentTimeMillis, md0VarO0ooOoO.f21205OooO0O0, str, (zOooO00o || z2 || z) ? 2 : 1);
                s50 s50Var = (s50) this.f17045OooOoO;
                s50Var.getClass();
                s50Var.OooO0O0(new C1548ey(12, s50Var, o0o0));
                return;
        }
    }

    public C1386ai(View view, InterfaceC1722jo interfaceC1722jo, InterfaceC2318zs interfaceC2318zs, ld0 ld0Var) {
        this.f17043OooOo0O = 9;
        this.f17042OooOo = view;
        this.f17045OooOoO = interfaceC1722jo;
        this.f17044OooOo0o = interfaceC2318zs;
        this.f17046OooOoO0 = ld0Var;
    }

    public /* synthetic */ C1386ai(EnumC2035s4 enumC2035s4, String str, C1740k5 c1740k5, String str2) {
        this.f17043OooOo0O = 10;
        this.f17044OooOo0o = enumC2035s4;
        this.f17045OooOoO = str;
        this.f17042OooOo = c1740k5;
        this.f17046OooOoO0 = str2;
    }

    public C1386ai(AbstractC1870no abstractC1870no, List list, String str, Uri uri) {
        this.f17043OooOo0O = 7;
        this.f17044OooOo0o = list;
        this.f17045OooOoO = str;
        this.f17042OooOo = uri;
        this.f17046OooOoO0 = abstractC1870no;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public /* bridge */ /* synthetic */ void mo13708zza(Object obj) throws JSONException {
        InterfaceC2266yd interfaceC2266yd = (InterfaceC2266yd) obj;
        zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f17042OooOo;
        C2274yl c2274yl = (C2274yl) this.f17046OooOoO0;
        C1676ie c1676ie = (C1676ie) this.f17045OooOoO;
        C2155vd c2155vd = (C2155vd) this.f17044OooOo0o;
        try {
            zzv.zzq();
            String string = UUID.randomUUID().toString();
            AbstractC2005rb.f23829OooOOOO.OooO00o(string, new C1639he(c1676ie, c2155vd, c2274yl));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3007ch.f7763x, string);
            jSONObject.put("args", ((InterfaceC1492de) c1676ie.f20030OooO0Oo).zzb(obj2));
            interfaceC2266yd.OooOOO((String) c1676ie.f20028OooO0O0, jSONObject);
        } catch (Exception e) {
            try {
                c2274yl.zzd(e);
                zzo.zzh("Unable to invokeJavascript", e);
            } finally {
                c2155vd.OooOO0o();
            }
        }
    }

    public /* synthetic */ C1386ai(C2130up c2130up, C1394aq c1394aq, Long l, String str) {
        this.f17043OooOo0O = 8;
        this.f17042OooOo = c2130up;
        this.f17046OooOoO0 = c1394aq;
        this.f17044OooOo0o = l;
        this.f17045OooOoO = str;
    }

    public C1386ai(kd0 kd0Var, InterfaceC1530eg interfaceC1530eg, AdFormat adFormat) {
        this.f17043OooOo0O = 11;
        this.f17045OooOoO = null;
        this.f17044OooOo0o = kd0Var;
        this.f17046OooOoO0 = interfaceC1530eg;
        this.f17042OooOo = adFormat;
    }

    public /* synthetic */ C1386ai(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f17043OooOo0O = i;
        this.f17044OooOo0o = obj;
        this.f17042OooOo = obj2;
        this.f17046OooOoO0 = obj3;
        this.f17045OooOoO = obj4;
    }

    public /* synthetic */ C1386ai(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f17043OooOo0O = i;
        this.f17044OooOo0o = obj2;
        this.f17042OooOo = obj3;
        this.f17046OooOoO0 = obj4;
        this.f17045OooOoO = obj;
    }

    public C1386ai(Context context, String str) {
        String packageName;
        this.f17043OooOo0O = 5;
        this.f17044OooOo0o = context;
        this.f17046OooOoO0 = str;
        this.f17045OooOoO = (String) wz0.f25458OooOo00.OooOOO();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f17042OooOo = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(C3451ne.f10411E, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        linkedHashMap.put(C3034d9.h.f8068G, zzs.zzs());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        zzv.zzq();
        linkedHashMap.put("is_lite_sdk", true != zzs.zzF(context) ? "0" : "1");
        C1424bj c1424bjZzn = zzv.zzn();
        c1424bjZzn.getClass();
        o00000oO.OooOOO oooOOOOooO0O0 = AbstractC2200wl.f25321OooO00o.OooO0O0(new CallableC2031s0(2, c1424bjZzn, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C2308zi) oooOOOOooO0O0.get()).f26189OooOO0));
            linkedHashMap.put("network_fine", Integer.toString(((C2308zi) oooOOOOooO0O0.get()).f26190OooOO0O));
        } catch (Exception e) {
            zzv.zzp().OooO0oo("CsiConfiguration.CsiConfiguration", e);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo00)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f17042OooOo;
            zzv.zzq();
            linkedHashMap2.put("is_bstar", true != zzs.zzC(context) ? "0" : "1");
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoo0)).booleanValue()) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17854o000oooo)).booleanValue() || xh0.OooOo(zzv.zzp().f23634OooO0oO)) {
                return;
            }
            ((LinkedHashMap) this.f17042OooOo).put(C3451ne.f10425K, zzv.zzp().f23634OooO0oO);
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        mf0 mf0Var;
        int i;
        switch (this.f17043OooOo0O) {
            case 7:
                zzo.zzj("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f17042OooOo)));
                return;
            case 13:
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo0)).booleanValue()) {
                    zze.zzb("Banner ad failed to load", th);
                }
                synchronized (((jc0) this.f17045OooOoO)) {
                    com.google.android.gms.ads.internal.client.zze zzeVarOooOo00 = af0.OooOo00(th, ((C1875nt) ((C2315zp) this.f17046OooOoO0).f26303o00000O0.zzb()).OooOO0o);
                    ((jc0) this.f17045OooOoO).f20283OooOOO = zzeVarOooOo00;
                    ((C2098tu) ((C2315zp) this.f17046OooOoO0).f26354o0ooOO0.zzb()).o0OOO0o(zzeVarOooOo00);
                    ze0.OooOoo0(zzeVarOooOo00.zza, "BannerAdLoader.onFailure", th);
                    jc0 jc0Var = (jc0) this.f17045OooOoO;
                    if (jc0Var.f20284OooOOO0) {
                        jc0Var.OooO0Oo();
                        jc0 jc0Var2 = (jc0) this.f17045OooOoO;
                        C2099tv c2099tv = jc0Var2.f20280OooO0oo;
                        C1509dw c1509dw = jc0Var2.f20281OooOO0;
                        synchronized (c1509dw) {
                            i = c1509dw.f18415OooOo0O;
                        }
                        c2099tv.o00000oo(i);
                    }
                    if (((Boolean) AbstractC1449c8.f17950OooO0OO.OooOOO()).booleanValue() && (mf0Var = (mf0) this.f17044OooOo0o) != null) {
                        mf0Var.OooO0OO(zzeVarOooOo00);
                        jf0 jf0Var = (jf0) this.f17042OooOo;
                        jf0Var.OooO0Oo(th);
                        jf0Var.OooOO0(false);
                        mf0Var.OooO00o(jf0Var);
                        mf0Var.OooO0oo();
                    } else {
                        nf0 nf0Var = ((jc0) this.f17045OooOoO).f20272OooO;
                        jf0 jf0Var2 = (jf0) this.f17042OooOo;
                        jf0Var2.OooO0oo(zzeVarOooOo00);
                        jf0Var2.OooO0Oo(th);
                        jf0Var2.OooOO0(false);
                        nf0Var.OooO0O0(jf0Var2.zzm());
                    }
                }
                return;
            default:
                return;
        }
    }

    private final void OooOOo0(Throwable th) {
    }

    public C1386ai(int i) {
        this.f17043OooOo0O = i;
        switch (i) {
            case 4:
                this.f17044OooOo0o = new r40();
                this.f17042OooOo = new r40();
                this.f17046OooOoO0 = new oO0Ooooo();
                break;
            case 16:
                this.f17044OooOo0o = null;
                this.f17042OooOo = null;
                this.f17046OooOoO0 = null;
                this.f17045OooOoO = null;
                break;
            case 17:
                this.f17044OooOo0o = null;
                this.f17042OooOo = null;
                this.f17046OooOoO0 = null;
                this.f17045OooOoO = tq0.f24471OooOoo;
                break;
            case 18:
                this.f17044OooOo0o = null;
                this.f17042OooOo = null;
                this.f17046OooOoO0 = null;
                this.f17045OooOoO = iv0.f20123OooO0o0;
                break;
            case 19:
                com.google.android.gms.internal.measurement.oo000o oo000oVar = new com.google.android.gms.internal.measurement.oo000o(0);
                this.f17044OooOo0o = oo000oVar;
                C2051sk c2051sk = new C2051sk((C2051sk) null, oo000oVar);
                this.f17046OooOoO0 = c2051sk;
                this.f17042OooOo = c2051sk.OooOOOo();
                com.google.android.gms.internal.measurement.oO00Oo0 oo00oo0 = new com.google.android.gms.internal.measurement.oO00Oo0(1);
                this.f17045OooOoO = oo00oo0;
                c2051sk.OooOoO("require", new C2337f0(oo00oo0));
                ((HashMap) oo00oo0.f26700OooOo0O).put("internal.platform", com.google.android.gms.internal.measurement.o0O0ooO.f26539OooOo0O);
                c2051sk.OooOoO("runtime.counter", new com.google.android.gms.internal.measurement.OooOO0O(Double.valueOf(0.0d)));
                break;
            case 22:
                this.f17044OooOo0o = new HashMap();
                this.f17042OooOo = new HashMap();
                this.f17046OooOoO0 = new HashMap();
                this.f17045OooOoO = new HashMap();
                break;
            default:
                o000OOoO.OooO oooO = new o000OOoO.OooO(2);
                o000000.OooO oooO2 = new o000000.OooO(2);
                this.f17044OooOo0o = new HashSet();
                this.f17042OooOo = oooO;
                this.f17046OooOoO0 = oooO2;
                break;
        }
    }

    public C1386ai(o000OO.oo000o oo000oVar) {
        this.f17043OooOo0O = 22;
        this.f17044OooOo0o = new HashMap(oo000oVar.f30191OooO00o);
        this.f17042OooOo = new HashMap(oo000oVar.f30192OooO0O0);
        this.f17046OooOoO0 = new HashMap(oo000oVar.f30193OooO0OO);
        this.f17045OooOoO = new HashMap(oo000oVar.f30194OooO0Oo);
    }

    public C1386ai(o0000Oo.OooOO0O oooOO0O) {
        this.f17043OooOo0O = 21;
        this.f17045OooOoO = oooOO0O;
    }
}
