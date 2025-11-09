package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.zn */
/* loaded from: classes2.dex */
public final class C2313zn implements e01, e61 {

    /* renamed from: Oooo */
    public static final AtomicInteger f26210Oooo = new AtomicInteger(0);

    /* renamed from: OoooO00 */
    public static final AtomicInteger f26211OoooO00 = new AtomicInteger(0);

    /* renamed from: OooOo */
    public final xa1 f26212OooOo;

    /* renamed from: OooOo0O */
    public final Context f26213OooOo0O;

    /* renamed from: OooOo0o */
    public final C2128un f26214OooOo0o;

    /* renamed from: OooOoO */
    public final WeakReference f26215OooOoO;

    /* renamed from: OooOoO0 */
    public final C2053sm f26216OooOoO0;

    /* renamed from: OooOoOO */
    public final b40 f26217OooOoOO;

    /* renamed from: OooOoo */
    public ByteBuffer f26218OooOoo;

    /* renamed from: OooOoo0 */
    public b61 f26219OooOoo0;

    /* renamed from: OooOooO */
    public boolean f26220OooOooO;

    /* renamed from: OooOooo */
    public InterfaceC1868nm f26221OooOooo;

    /* renamed from: Oooo0 */
    public final String f26222Oooo0;

    /* renamed from: Oooo000 */
    public int f26223Oooo000;

    /* renamed from: Oooo00O */
    public int f26224Oooo00O;

    /* renamed from: Oooo00o */
    public long f26225Oooo00o;

    /* renamed from: Oooo0O0 */
    public final int f26226Oooo0O0;

    /* renamed from: Oooo0o */
    public final ArrayList f26228Oooo0o;

    /* renamed from: Oooo0o0 */
    public Integer f26229Oooo0o0;

    /* renamed from: Oooo0oO */
    public volatile C2165vn f26230Oooo0oO;

    /* renamed from: Oooo0OO */
    public final Object f26227Oooo0OO = new Object();

    /* renamed from: Oooo0oo */
    public final HashSet f26231Oooo0oo = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2313zn(android.content.Context r6, com.google.android.gms.internal.ads.C2053sm r7, com.google.android.gms.internal.ads.InterfaceC1722jo r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2313zn.<init>(android.content.Context, com.google.android.gms.internal.ads.sm, com.google.android.gms.internal.ads.jo, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO00o(d61 d61Var, e91 e91Var) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0O0(int i) {
        InterfaceC1868nm interfaceC1868nm = this.f26221OooOooo;
        if (interfaceC1868nm != null) {
            interfaceC1868nm.OooO0Oo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0OO(IOException iOException) {
        InterfaceC1868nm interfaceC1868nm = this.f26221OooOooo;
        if (interfaceC1868nm != null) {
            if (this.f26216OooOoO0.f24119OooOO0) {
                interfaceC1868nm.OooO0O0(iOException);
            } else {
                interfaceC1868nm.OooO00o(iOException, "onLoadError");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0Oo(o0OoOo0 o0oooo0) {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26215OooOoO.get();
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue() || interfaceC1722jo == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = o0oooo0.OooOO0o;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = o0oooo0.f22222OooOOO0;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = o0oooo0.f22219OooOO0;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        interfaceC1722jo.OooO0o("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final void OooO0o(iq0 iq0Var, boolean z, int i) {
        this.f26223Oooo000 += i;
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooO0o0(o0OoOo0 o0oooo0) {
        InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26215OooOoO.get();
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue() || interfaceC1722jo == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(o0oooo0.f22230OooOo0O));
        map.put("bitRate", String.valueOf(o0oooo0.f22210OooO));
        map.put("resolution", o0oooo0.f22229OooOo00 + "x" + o0oooo0.OooOo0);
        String str = o0oooo0.OooOO0o;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = o0oooo0.f22222OooOOO0;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = o0oooo0.f22219OooOO0;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        interfaceC1722jo.OooO0o("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOO0(AbstractC1632h7 abstractC1632h7) {
        InterfaceC1868nm interfaceC1868nm = this.f26221OooOooo;
        if (interfaceC1868nm != null) {
            interfaceC1868nm.OooO00o(abstractC1632h7, "onPlayerError");
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOO0O(int i) {
        this.f26224Oooo00O += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.e01
    public final void OooOO0o(rj0 rj0Var, iq0 iq0Var, boolean z) {
        if (rj0Var instanceof ux0) {
            synchronized (this.f26227Oooo0OO) {
                this.f26228Oooo0o.add((ux0) rj0Var);
            }
        } else if (rj0Var instanceof C2165vn) {
            this.f26230Oooo0oO = (C2165vn) rj0Var;
            InterfaceC1722jo interfaceC1722jo = (InterfaceC1722jo) this.f26215OooOoO.get();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17942oooo00o)).booleanValue() && interfaceC1722jo != null && this.f26230Oooo0oO.f25014Oooo0) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f26230Oooo0oO.f25019Oooo0OO));
                map.put("gcacheDownloaded", String.valueOf(this.f26230Oooo0oO.f25021Oooo0o0));
                zzs.zza.post(new wp0(13, interfaceC1722jo, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOOO(C1721jn c1721jn) {
        InterfaceC1868nm interfaceC1868nm = this.f26221OooOooo;
        if (interfaceC1868nm != null) {
            interfaceC1868nm.OooO0OO(c1721jn.f20338OooO00o, c1721jn.f20339OooO0O0);
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final void OooOOOO() {
        InterfaceC1868nm interfaceC1868nm = this.f26221OooOooo;
        if (interfaceC1868nm != null) {
            interfaceC1868nm.zzv();
        }
    }

    public final void OooOOo(Uri[] uriArr, ByteBuffer byteBuffer, boolean z) {
        Object p91Var;
        if (this.f26219OooOoo0 != null) {
            this.f26218OooOoo = byteBuffer;
            this.f26220OooOooO = z;
            int length = uriArr.length;
            if (length == 1) {
                p91Var = OooOo00(uriArr[0]);
            } else {
                n81[] n81VarArr = new n81[length];
                for (int i = 0; i < uriArr.length; i++) {
                    n81VarArr[i] = OooOo00(uriArr[i]);
                }
                p91Var = new p91(new g61(4), n81VarArr);
            }
            b61 b61Var = this.f26219OooOoo0;
            b61Var.f17421OooOoO0.OooO00o();
            w41 w41Var = b61Var.f17420OooOo;
            w41Var.OooOo00();
            List listSingletonList = Collections.singletonList(p91Var);
            w41Var.OooOo00();
            w41Var.OooOo00();
            w41Var.o0000(w41Var.f25227ooOO);
            w41Var.o0000Oo0();
            w41Var.f25203OoooO++;
            ArrayList arrayList = w41Var.f25197Oooo0O0;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    arrayList.remove(i2);
                }
                da1 da1Var = w41Var.f25225o00o0O;
                int[] iArr = da1Var.f18222OooO0O0;
                int[] iArr2 = new int[iArr.length - size];
                int i3 = 0;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 < 0 || i5 >= size) {
                        int i6 = i4 - i3;
                        if (i5 >= 0) {
                            i5 -= size;
                        }
                        iArr2[i6] = i5;
                    } else {
                        i3++;
                    }
                }
                w41Var.f25225o00o0O = new da1(iArr2, new Random(da1Var.f18221OooO00o.nextLong()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < listSingletonList.size(); i7++) {
                p51 p51Var = new p51((n81) listSingletonList.get(i7), w41Var.f25198Oooo0OO);
                arrayList2.add(p51Var);
                arrayList.add(i7, new v41(p51Var.f23227OooO0O0, p51Var.f23226OooO00o));
            }
            w41Var.f25225o00o0O = w41Var.f25225o00o0O.OooO00o(arrayList2.size());
            x51 x51Var = new x51(arrayList, w41Var.f25225o00o0O);
            boolean zOooOOOO = x51Var.OooOOOO();
            int i8 = x51Var.f25520OooO0Oo;
            if (!zOooOOOO && i8 < 0) {
                throw new o0O0O00();
            }
            int iOooO0oO = x51Var.OooO0oO(false);
            r51 r51VarO0000O0O = w41Var.o0000O0O(w41Var.f25227ooOO, x51Var, w41Var.o0000O0(x51Var, iOooO0oO, -9223372036854775807L));
            int i9 = r51VarO0000O0O.f23761OooO0o0;
            if (iOooO0oO != -1 && i9 != 1) {
                i9 = 4;
                if (!x51Var.OooOOOO() && iOooO0oO < i8) {
                    i9 = 2;
                }
            }
            r51 r51VarOooO0o0 = r51VarO0000O0O.OooO0o0(i9);
            long jOooOOoo = i80.OooOOoo(-9223372036854775807L);
            da1 da1Var2 = w41Var.f25225o00o0O;
            b51 b51Var = w41Var.f25194Oooo000;
            b51Var.getClass();
            b51Var.f17380OooOoo.OooO00o(17, new y41(arrayList2, da1Var2, iOooO0oO, jOooOOoo)).OooO00o();
            w41Var.o0000OOo(r51VarOooO0o0, 0, (w41Var.f25227ooOO.f23757OooO0O0.f19657OooO00o.equals(r51VarOooO0o0.f23757OooO0O0.f19657OooO00o) || w41Var.f25227ooOO.f23756OooO00o.OooOOOO()) ? false : true, 4, w41Var.o0000oo(r51VarOooO0o0), -1);
            b61 b61Var2 = this.f26219OooOoo0;
            b61Var2.f17421OooOoO0.OooO00o();
            w41 w41Var2 = b61Var2.f17420OooOo;
            w41Var2.OooOo00();
            boolean zO0000o0 = w41Var2.o0000o0();
            f41 f41Var = w41Var2.f25204OoooO0;
            f41Var.OooO00o();
            f41Var.OooO0O0(0);
            w41Var2.o0000OOO(1, 1, zO0000o0);
            r51 r51Var = w41Var2.f25227ooOO;
            if (r51Var.f23761OooO0o0 == 1) {
                r51 r51VarOooO0Oo = r51Var.OooO0Oo(null);
                r51 r51VarOooO0o02 = r51VarOooO0Oo.OooO0o0(true != r51VarOooO0Oo.f23756OooO00o.OooOOOO() ? 2 : 4);
                w41Var2.f25203OoooO++;
                m60 m60Var = w41Var2.f25194Oooo000.f17380OooOoo;
                m60Var.getClass();
                q50 q50VarOooO0o0 = m60.OooO0o0();
                q50VarOooO0o0.f23511OooO00o = m60Var.f21095OooO00o.obtainMessage(29);
                q50VarOooO0o0.OooO00o();
                w41Var2.o0000OOo(r51VarOooO0o02, 1, false, 5, -9223372036854775807L, -1);
            }
            f26211OoooO00.incrementAndGet();
        }
    }

    public final long OooOOo0() {
        if (this.f26230Oooo0oO != null && this.f26230Oooo0oO.f25018Oooo0O0) {
            C2165vn c2165vn = this.f26230Oooo0oO;
            if (c2165vn.f25017Oooo00o != null) {
                if (c2165vn.f25023Oooo0oo.get() != -1) {
                    return c2165vn.f25023Oooo0oo.get();
                }
                synchronized (c2165vn) {
                    try {
                        if (c2165vn.f25022Oooo0oO == null) {
                            c2165vn.f25022Oooo0oO = AbstractC2200wl.f25321OooO00o.OooO0O0(new CallableC1736k1(c2165vn, 3));
                        }
                    } finally {
                    }
                }
                if (c2165vn.f25022Oooo0oO.isDone()) {
                    try {
                        c2165vn.f25023Oooo0oo.compareAndSet(-1L, ((Long) c2165vn.f25022Oooo0oO.get()).longValue());
                        return c2165vn.f25023Oooo0oo.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.f26227Oooo0OO) {
            while (!this.f26228Oooo0o.isEmpty()) {
                long j = this.f26225Oooo00o;
                Map mapZze = ((ux0) this.f26228Oooo0o.remove(0)).zze();
                long j2 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && xh0.OoooO("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                continue;
                            }
                        }
                    }
                }
                this.f26225Oooo00o = j + j2;
            }
        }
        return this.f26225Oooo00o;
    }

    public final void OooOOoo(boolean z) {
        qa1 qa1Var;
        boolean zEquals;
        if (this.f26219OooOoo0 == null) {
            return;
        }
        int i = 0;
        while (true) {
            b61 b61Var = this.f26219OooOoo0;
            b61Var.f17421OooOoO0.OooO00o();
            w41 w41Var = b61Var.f17420OooOo;
            w41Var.OooOo00();
            int length = w41Var.f25188OooOoo.length;
            if (i >= 2) {
                return;
            }
            xa1 xa1Var = this.f26212OooOo;
            synchronized (xa1Var.f25588OooO0OO) {
                qa1Var = xa1Var.f25590OooO0o;
            }
            qa1Var.getClass();
            pa1 pa1Var = new pa1(qa1Var);
            boolean z2 = !z;
            SparseBooleanArray sparseBooleanArray = pa1Var.f23267OooOo00;
            if (sparseBooleanArray.get(i) != z2) {
                if (z) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            qa1 qa1Var2 = new qa1(pa1Var);
            synchronized (xa1Var.f25588OooO0OO) {
                zEquals = xa1Var.f25590OooO0o.equals(qa1Var2);
                xa1Var.f25590OooO0o = qa1Var2;
            }
            if (!zEquals) {
                if (qa1Var2.f23560OooOOOo && xa1Var.f25589OooO0Oo == null) {
                    AbstractC1641hg.OooOOo0("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                b51 b51Var = xa1Var.f25586OooO00o;
                if (b51Var != null) {
                    b51Var.f17380OooOoo.OooO0OO(10);
                }
            }
            i++;
        }
    }

    public final long OooOo0() {
        if (this.f26230Oooo0oO != null && this.f26230Oooo0oO.f25018Oooo0O0 && this.f26230Oooo0oO.f25019Oooo0OO) {
            return Math.min(this.f26223Oooo000, this.f26230Oooo0oO.f25020Oooo0o);
        }
        return 0L;
    }

    public final x91 OooOo00(Uri uri) {
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        List list = Collections.EMPTY_LIST;
        gn0 gn0Var2 = gn0.f19388OooOoO;
        oOO00000 ooo00000 = oOO00000.f22776OooO00o;
        C1550f c1550f = new C1550f("", new o0O0O0Oo(), uri != null ? new oO00o00O(uri, gn0Var2) : null, new oO000Oo0(), C1626h1.f19498OooOoO);
        int i = this.f26216OooOoO0.f24115OooO0o;
        b40 b40Var = this.f26217OooOoOO;
        b40Var.f17365OooO00o = i;
        c1550f.f18716OooO0O0.getClass();
        return new x91(c1550f, (im0) b40Var.f17366OooO0O0, (rh0) b40Var.f17367OooO0OO, (g61) b40Var.f17368OooO0Oo, b40Var.f17365OooO00o);
    }

    public final void finalize() {
        f26210Oooo.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooOOO0(g41 g41Var) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooOOOo(int i) {
    }

    @Override // com.google.android.gms.internal.ads.e01
    public final void OooO(iq0 iq0Var, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO0oO(b61 b61Var, dx0 dx0Var) {
    }

    @Override // com.google.android.gms.internal.ads.e61
    public final /* synthetic */ void OooO0oo(d61 d61Var, int i, long j) {
    }
}
