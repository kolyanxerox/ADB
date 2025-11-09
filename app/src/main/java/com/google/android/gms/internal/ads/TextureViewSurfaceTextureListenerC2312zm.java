package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.tika.metadata.TikaCoreProperties;

/* renamed from: com.google.android.gms.internal.ads.zm */
/* loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC2312zm extends AbstractC1684im implements TextureView.SurfaceTextureListener, InterfaceC1868nm {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2129uo f26193OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final C2053sm f26194OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final C2090tm f26195OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public C1831mm f26196OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public C2313zn f26197OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public Surface f26198OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public String f26199OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public String[] f26200OooOooo;

    /* renamed from: Oooo0, reason: collision with root package name */
    public final boolean f26201Oooo0;

    /* renamed from: Oooo000, reason: collision with root package name */
    public boolean f26202Oooo000;

    /* renamed from: Oooo00O, reason: collision with root package name */
    public int f26203Oooo00O;

    /* renamed from: Oooo00o, reason: collision with root package name */
    public C2016rm f26204Oooo00o;

    /* renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f26205Oooo0O0;

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f26206Oooo0OO;

    /* renamed from: Oooo0o, reason: collision with root package name */
    public int f26207Oooo0o;

    /* renamed from: Oooo0o0, reason: collision with root package name */
    public int f26208Oooo0o0;

    /* renamed from: Oooo0oO, reason: collision with root package name */
    public float f26209Oooo0oO;

    public TextureViewSurfaceTextureListenerC2312zm(Context context, C2090tm c2090tm, C2129uo c2129uo, boolean z, C2053sm c2053sm) {
        super(context);
        this.f26203Oooo00O = 1;
        this.f26193OooOo = c2129uo;
        this.f26195OooOoO0 = c2090tm;
        this.f26201Oooo0 = z;
        this.f26194OooOoO = c2053sm;
        setSurfaceTextureListener(this);
        c2090tm.OooO00o(this);
    }

    public static String OooOoo(Exception exc, String str) {
        return str + "/" + exc.getClass().getCanonicalName() + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooO() {
        if (Oooo00o()) {
            return (int) this.f26197OooOoo.f26219OooOoo0.o0000oo();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO00o(Exception exc, String str) {
        C2313zn c2313zn;
        String strOooOoo = OooOoo(exc, str);
        zzo.zzj("ExoPlayerAdapter error: ".concat(strOooOoo));
        this.f26202Oooo000 = true;
        if (this.f26194OooOoO.f24111OooO00o && (c2313zn = this.f26197OooOoo) != null) {
            c2313zn.OooOOoo(false);
        }
        zzs.zza.post(new RunnableC2275ym(this, strOooOoo, 1));
        zzv.zzp().OooO0oO("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0O0(IOException iOException) {
        String strOooOoo = OooOoo(iOException, "onLoadException");
        zzo.zzj("ExoPlayerAdapter exception: ".concat(strOooOoo));
        zzv.zzp().OooO0oO("AdExoPlayerView.onException", iOException);
        zzs.zza.post(new RunnableC2275ym(this, strOooOoo, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0OO(int i, int i2) {
        this.f26208Oooo0o0 = i;
        this.f26207Oooo0o = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.f26209Oooo0oO != f) {
            this.f26209Oooo0oO = f;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0Oo(int i) {
        C2313zn c2313zn;
        if (this.f26203Oooo00O != i) {
            this.f26203Oooo00O = i;
            if (i == 3) {
                OooOooO();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.f26194OooOoO.f24111OooO00o && (c2313zn = this.f26197OooOoo) != null) {
                c2313zn.OooOOoo(false);
            }
            this.f26195OooOoO0.f24343OooOOO0 = false;
            C2164vm c2164vm = this.f20062OooOo0o;
            c2164vm.f24999OooO0Oo = false;
            c2164vm.OooO00o();
            zzs.zza.post(new RunnableC2201wm(this, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooO0o(int i) {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            C2128un c2128un = c2313zn.f26214OooOo0o;
            synchronized (c2128un) {
                c2128un.f24663OooO0O0 = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void OooO0o0(long j, boolean z) {
        if (this.f26193OooOo != null) {
            AbstractC2200wl.f25325OooO0o.execute(new RunnableC2238xm(this, z, j, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooO0oO(int i) throws SocketException {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            Iterator it = c2313zn.f26231Oooo0oo.iterator();
            while (it.hasNext()) {
                C2091tn c2091tn = (C2091tn) ((WeakReference) it.next()).get();
                if (c2091tn != null) {
                    c2091tn.f24363Oooo0o = i;
                    Iterator it2 = c2091tn.f24365Oooo0oO.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c2091tn.f24363Oooo0o);
                            } catch (SocketException e) {
                                zzo.zzk("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooO0oo(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f26200OooOooo = new String[]{str};
        } else {
            this.f26200OooOooo = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f26199OooOooO;
        boolean z = false;
        if (this.f26194OooOoO.f24120OooOO0O && str2 != null && !str.equals(str2) && this.f26203Oooo00O == 4) {
            z = true;
        }
        this.f26199OooOooO = str;
        OooOooo(z, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0() {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            return c2313zn.f26224Oooo00O;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0O() {
        if (Oooo00o()) {
            return (int) this.f26197OooOoo.f26219OooOoo0.o0000oO();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOO0o() {
        return this.f26207Oooo0o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOO() {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            return c2313zn.OooOo0();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final int OooOOO0() {
        return this.f26208Oooo0o0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOO() {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn == null) {
            return -1L;
        }
        if (c2313zn.f26230Oooo0oO == null || !c2313zn.f26230Oooo0oO.f25018Oooo0O0) {
            return c2313zn.f26223Oooo000;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final long OooOOOo() {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            return c2313zn.OooOOo0();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOo() {
        C2313zn c2313zn;
        if (Oooo00o()) {
            if (this.f26194OooOoO.f24111OooO00o && (c2313zn = this.f26197OooOoo) != null) {
                c2313zn.OooOOoo(false);
            }
            b61 b61Var = this.f26197OooOoo.f26219OooOoo0;
            b61Var.f17421OooOoO0.OooO00o();
            b61Var.f17420OooOo.o0000OoO(false);
            this.f26195OooOoO0.f24343OooOOO0 = false;
            C2164vm c2164vm = this.f20062OooOo0o;
            c2164vm.f24999OooO0Oo = false;
            c2164vm.OooO00o();
            zzs.zza.post(new RunnableC2201wm(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final String OooOOo0() {
        return "ExoPlayer/2".concat(true != this.f26201Oooo0 ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOOoo() {
        C2313zn c2313zn;
        if (!Oooo00o()) {
            this.f26206Oooo0OO = true;
            return;
        }
        if (this.f26194OooOoO.f24111OooO00o && (c2313zn = this.f26197OooOoo) != null) {
            c2313zn.OooOOoo(true);
        }
        b61 b61Var = this.f26197OooOoo.f26219OooOoo0;
        b61Var.f17421OooOoO0.OooO00o();
        b61Var.f17420OooOo.o0000OoO(true);
        this.f26195OooOoO0.OooO0O0();
        C2164vm c2164vm = this.f20062OooOo0o;
        c2164vm.f24999OooO0Oo = true;
        c2164vm.OooO00o();
        this.f20061OooOo0O.f23374OooO0OO = true;
        zzs.zza.post(new RunnableC2201wm(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo(float f, float f2) {
        C2016rm c2016rm = this.f26204Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO0OO(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0(C1831mm c1831mm) {
        this.f26196OooOoOO = c1831mm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo00(int i) {
        if (Oooo00o()) {
            long j = i;
            b61 b61Var = this.f26197OooOoo.f26219OooOoo0;
            b61Var.oo0o0Oo(b61Var.o000000(), j);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0O(String str) {
        if (str != null) {
            OooO0oo(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOo0o() {
        if (Oooo0()) {
            b61 b61Var = this.f26197OooOoo.f26219OooOoo0;
            b61Var.f17421OooOoO0.OooO00o();
            b61Var.f17420OooOo.zzt();
            Oooo000();
        }
        C2090tm c2090tm = this.f26195OooOoO0;
        c2090tm.f24343OooOOO0 = false;
        C2164vm c2164vm = this.f20062OooOo0o;
        c2164vm.f24999OooO0Oo = false;
        c2164vm.OooO00o();
        c2090tm.OooO0OO();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOoO(int i) {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            C2128un c2128un = c2313zn.f26214OooOo0o;
            synchronized (c2128un) {
                c2128un.f24665OooO0Oo = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final Integer OooOoO0() {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            return c2313zn.f26229Oooo0o0;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOoOO(int i) {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            C2128un c2128un = c2313zn.f26214OooOo0o;
            synchronized (c2128un) {
                c2128un.f24667OooO0o0 = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1684im
    public final void OooOoo0(int i) {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            C2128un c2128un = c2313zn.f26214OooOo0o;
            synchronized (c2128un) {
                c2128un.f24664OooO0OO = i * 1000;
            }
        }
    }

    public final void OooOooO() {
        if (this.f26205Oooo0O0) {
            return;
        }
        this.f26205Oooo0O0 = true;
        zzs.zza.post(new RunnableC2201wm(this, 7));
        zzn();
        C2090tm c2090tm = this.f26195OooOoO0;
        if (c2090tm.f24331OooO && !c2090tm.f24340OooOO0) {
            ze0.OooOOO0(c2090tm.f24337OooO0o0, c2090tm.f24335OooO0Oo, "vfr2");
            c2090tm.f24340OooOO0 = true;
        }
        if (this.f26206Oooo0OO) {
            OooOOoo();
        }
    }

    public final void OooOooo(boolean z, Integer num) {
        AbstractC1869nn abstractC1869nn;
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null && !z) {
            c2313zn.f26229Oooo0o0 = num;
            return;
        }
        if (this.f26199OooOooO == null || this.f26198OooOoo0 == null) {
            return;
        }
        if (z) {
            if (!Oooo0()) {
                zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            b61 b61Var = c2313zn.f26219OooOoo0;
            b61Var.f17421OooOoO0.OooO00o();
            b61Var.f17420OooOo.zzt();
            Oooo000();
        }
        if (this.f26199OooOooO.startsWith("cache:")) {
            C2129uo c2129uo = this.f26193OooOo;
            String str = this.f26199OooOooO;
            ViewTreeObserverOnGlobalLayoutListenerC2166vo viewTreeObserverOnGlobalLayoutListenerC2166vo = c2129uo.f24671OooOo0O;
            synchronized (viewTreeObserverOnGlobalLayoutListenerC2166vo) {
                HashMap map = viewTreeObserverOnGlobalLayoutListenerC2166vo.f25069o00o0O;
                if (map == null) {
                    abstractC1869nn = null;
                } else {
                    abstractC1869nn = (AbstractC1869nn) map.get(str);
                }
            }
            if (abstractC1869nn instanceof C2017rn) {
                C2017rn c2017rn = (C2017rn) abstractC1869nn;
                synchronized (c2017rn) {
                    c2017rn.f23918OooOoo0 = true;
                    c2017rn.notify();
                }
                C2313zn c2313zn2 = c2017rn.f23915OooOoO0;
                c2313zn2.f26221OooOooo = null;
                c2017rn.f23915OooOoO0 = null;
                this.f26197OooOoo = c2313zn2;
                c2313zn2.f26229Oooo0o0 = num;
                if (c2313zn2.f26219OooOoo0 == null) {
                    zzo.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(abstractC1869nn instanceof C1980qn)) {
                    zzo.zzj("Stream cache miss: ".concat(String.valueOf(this.f26199OooOooO)));
                    return;
                }
                C1980qn c1980qn = (C1980qn) abstractC1869nn;
                zzs zzsVarZzq = zzv.zzq();
                C2129uo c2129uo2 = this.f26193OooOo;
                zzsVarZzq.zzc(c2129uo2.getContext(), c2129uo2.f24671OooOo0O.f25029OooOoO.afmaVersion);
                synchronized (c1980qn.f23663Oooo000) {
                    try {
                        ByteBuffer byteBuffer = c1980qn.f23660OooOooO;
                        if (byteBuffer != null && !c1980qn.f23661OooOooo) {
                            byteBuffer.flip();
                            c1980qn.f23661OooOooo = true;
                        }
                        c1980qn.f23657OooOoOO = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = c1980qn.f23660OooOooO;
                boolean z2 = c1980qn.f23662Oooo0;
                String str2 = c1980qn.f23656OooOoO0;
                if (str2 == null) {
                    zzo.zzj("Stream cache URL is null.");
                    return;
                }
                C2129uo c2129uo3 = this.f26193OooOo;
                C2313zn c2313zn3 = new C2313zn(c2129uo3.getContext(), this.f26194OooOoO, c2129uo3, num);
                zzo.zzi("ExoPlayerAdapter initialized.");
                this.f26197OooOoo = c2313zn3;
                c2313zn3.OooOOo(new Uri[]{Uri.parse(str2)}, byteBuffer2, z2);
            }
        } else {
            C2129uo c2129uo4 = this.f26193OooOo;
            C2313zn c2313zn4 = new C2313zn(c2129uo4.getContext(), this.f26194OooOoO, c2129uo4, num);
            zzo.zzi("ExoPlayerAdapter initialized.");
            this.f26197OooOoo = c2313zn4;
            zzs zzsVarZzq2 = zzv.zzq();
            C2129uo c2129uo5 = this.f26193OooOo;
            zzsVarZzq2.zzc(c2129uo5.getContext(), c2129uo5.f24671OooOo0O.f25029OooOoO.afmaVersion);
            Uri[] uriArr = new Uri[this.f26200OooOooo.length];
            int i = 0;
            while (true) {
                String[] strArr = this.f26200OooOooo;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            C2313zn c2313zn5 = this.f26197OooOoo;
            c2313zn5.getClass();
            c2313zn5.OooOOo(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f26197OooOoo.f26221OooOooo = this;
        Oooo00O(this.f26198OooOoo0);
        b61 b61Var2 = this.f26197OooOoo.f26219OooOoo0;
        if (b61Var2 != null) {
            int iZzf = b61Var2.zzf();
            this.f26203Oooo00O = iZzf;
            if (iZzf == 3) {
                OooOooO();
            }
        }
    }

    public final boolean Oooo0() {
        C2313zn c2313zn = this.f26197OooOoo;
        return (c2313zn == null || c2313zn.f26219OooOoo0 == null || this.f26202Oooo000) ? false : true;
    }

    public final void Oooo000() {
        if (this.f26197OooOoo != null) {
            Oooo00O(null);
            C2313zn c2313zn = this.f26197OooOoo;
            if (c2313zn != null) {
                c2313zn.f26221OooOooo = null;
                b61 b61Var = c2313zn.f26219OooOoo0;
                if (b61Var != null) {
                    b61Var.f17421OooOoO0.OooO00o();
                    b61Var.f17420OooOo.o00000oo(c2313zn);
                    b61 b61Var2 = c2313zn.f26219OooOoo0;
                    b61Var2.f17421OooOoO0.OooO00o();
                    b61Var2.f17420OooOo.o0000o();
                    c2313zn.f26219OooOoo0 = null;
                    C2313zn.f26211OoooO00.decrementAndGet();
                }
                this.f26197OooOoo = null;
            }
            this.f26203Oooo00O = 1;
            this.f26202Oooo000 = false;
            this.f26205Oooo0O0 = false;
            this.f26206Oooo0OO = false;
        }
    }

    public final void Oooo00O(Surface surface) {
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn == null) {
            zzo.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            b61 b61Var = c2313zn.f26219OooOoo0;
            if (b61Var != null) {
                b61Var.f17421OooOoO0.OooO00o();
                w41 w41Var = b61Var.f17420OooOo;
                w41Var.OooOo00();
                w41Var.o0000OO0(surface);
                int i = surface == null ? 0 : -1;
                w41Var.o000OO(i, i);
            }
        } catch (IOException e) {
            zzo.zzk("", e);
        }
    }

    public final boolean Oooo00o() {
        return Oooo0() && this.f26203Oooo00O != 1;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.f26209Oooo0oO;
        if (f != 0.0f && this.f26204Oooo00o == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C2016rm c2016rm = this.f26204Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO00o(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws InterruptedException {
        C2313zn c2313zn;
        float f;
        int i3;
        SurfaceTexture surfaceTexture2;
        if (this.f26201Oooo0) {
            C2016rm c2016rm = new C2016rm(getContext());
            this.f26204Oooo00o = c2016rm;
            c2016rm.f23901Oooo00o = i;
            c2016rm.f23900Oooo00O = i2;
            c2016rm.f23902Oooo0O0 = surfaceTexture;
            c2016rm.start();
            C2016rm c2016rm2 = this.f26204Oooo00o;
            if (c2016rm2.f23902Oooo0O0 == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c2016rm2.f23907Oooo0oo.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c2016rm2.f23898Oooo0;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f26204Oooo00o.OooO0O0();
                this.f26204Oooo00o = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f26198OooOoo0 = surface;
        if (this.f26197OooOoo == null) {
            OooOooo(false, null);
        } else {
            Oooo00O(surface);
            if (!this.f26194OooOoO.f24111OooO00o && (c2313zn = this.f26197OooOoo) != null) {
                c2313zn.OooOOoo(true);
            }
        }
        int i4 = this.f26208Oooo0o0;
        if (i4 == 0 || (i3 = this.f26207Oooo0o) == 0) {
            f = i2 > 0 ? i / i2 : 1.0f;
            if (this.f26209Oooo0oO != f) {
                this.f26209Oooo0oO = f;
                requestLayout();
            }
        } else {
            f = i3 > 0 ? i4 / i3 : 1.0f;
            if (this.f26209Oooo0oO != f) {
                this.f26209Oooo0oO = f;
                requestLayout();
            }
        }
        zzs.zza.post(new RunnableC2201wm(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        OooOOo();
        C2016rm c2016rm = this.f26204Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO0O0();
            this.f26204Oooo00o = null;
        }
        C2313zn c2313zn = this.f26197OooOoo;
        if (c2313zn != null) {
            if (c2313zn != null) {
                c2313zn.OooOOoo(false);
            }
            Surface surface = this.f26198OooOoo0;
            if (surface != null) {
                surface.release();
            }
            this.f26198OooOoo0 = null;
            Oooo00O(null);
        }
        zzs.zza.post(new RunnableC2201wm(this, 3));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2016rm c2016rm = this.f26204Oooo00o;
        if (c2016rm != null) {
            c2016rm.OooO00o(i, i2);
        }
        zzs.zza.post(new RunnableC1610gm(this, i, i2, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f26195OooOoO0.OooO0Oo(this);
        this.f20061OooOo0O.OooO00o(surfaceTexture, this.f26196OooOoOO);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new com.google.android.gms.common.api.internal.Oooo000(this, i, 4));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2127um
    public final void zzn() {
        zzs.zza.post(new RunnableC2201wm(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1868nm
    public final void zzv() {
        zzs.zza.post(new RunnableC2201wm(this, 0));
    }
}
