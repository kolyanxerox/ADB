package io.flutter.plugins.webviewflutter;

import OoooO0O.o0000O0O;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.o00O000;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.store.core.api.Store;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o0000ooO.o0O00OOO;
import o0000ooO.o0O0O0Oo;
import o000oOoo.o000O00O;
import org.apache.tika.embedder.ExternalEmbedder;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f28800OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f28801OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f28802OooOo0o;

    public /* synthetic */ OooOOOO(int i, Object obj, Object obj2) {
        this.f28801OooOo0O = i;
        this.f28802OooOo0o = obj;
        this.f28800OooOo = obj2;
    }

    private final void OooO00o() {
        o000Ooo.o00oO0o o00oo0o;
        o0000O0O o0000o0o2 = (o0000O0O) this.f28802OooOo0o;
        o000oo0.o0ooOOo o0ooooo = (o000oo0.o0ooOOo) this.f28800OooOo;
        synchronized (o0000o0o2) {
            HashSet hashSet = new HashSet((HashSet) o0000o0o2.f13933OooO0OO);
            ((HashSet) o0000o0o2.f13935OooO0o).remove(o0ooooo);
            ((HashSet) o0000o0o2.f13933OooO0OO).add(o0ooooo);
            o000oo0.o00oO0o o00oo0o2 = o0ooooo.f31059OooO0o;
            if (o00oo0o2 == null || (o00oo0o = o00oo0o2.f31042OooO00o) == null || !((o000oo0.oo000o) o00oo0o.f30487OooOo0o).OooOO0O()) {
                o000oo0.o00oO0o o00oo0o3 = o0ooooo.f31059OooO0o;
                if ((o00oo0o3 != null ? o00oo0o3.OooO00o() : null) != null) {
                    HashMap map = (HashMap) o0000o0o2.f13937OooO0oO;
                    o000oo0.o00oO0o o00oo0o4 = o0ooooo.f31059OooO0o;
                    map.remove(o00oo0o4 != null ? o00oo0o4.OooO00o() : null);
                }
            }
            o0000o0o2.OooO0oo(o0ooooo);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o0000o0o2.OooO0oo((o000oo0.o0ooOOo) it.next());
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        o000Oo00.OooOOO0 oooOOO0;
        switch (this.f28801OooOo0O) {
            case 0:
                ((JavaScriptChannel) this.f28802OooOo0o).lambda$postMessage$1((String) this.f28800OooOo);
                return;
            case 1:
                o0000oo0.o00000O0 o00000o02 = (o0000oo0.o00000O0) this.f28802OooOo0o;
                o000Oo00.OooOOO oooOOO = (o000Oo00.OooOOO) this.f28800OooOo;
                if (o00000o02.f29663OooO0O0 != o0000oo0.o00000O0.f29661OooO0Oo) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (o00000o02) {
                    oooOOO0 = o00000o02.f29662OooO00o;
                    o00000o02.f29662OooO00o = null;
                    o00000o02.f29663OooO0O0 = oooOOO;
                }
                oooOOO0.OooO00o(oooOOO);
                return;
            case 2:
                o0000oo0.o00000 o00000Var = (o0000oo0.o00000) this.f28802OooOo0o;
                o000Oo00.OooOOO oooOOO2 = (o000Oo00.OooOOO) this.f28800OooOo;
                synchronized (o00000Var) {
                    try {
                        if (o00000Var.f29656OooO0O0 == null) {
                            o00000Var.f29655OooO00o.add(oooOOO2);
                        } else {
                            o00000Var.f29656OooO0O0.add(oooOOO2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                Map.Entry entry = (Map.Entry) this.f28802OooOo0o;
                o000OOo0.OooO00o oooO00o = (o000OOo0.OooO00o) this.f28800OooOo;
                ((o0000oO0.o0OoOo0) entry.getKey()).getClass();
                boolean z = oooO00o.f30266OooO00o.f29577OooOo0o;
                synchronized (o0000oO0.o000oOoO.class) {
                    o0000oO0.o000oOoO o000oooo2 = o0000oO0.o000oOoO.f29639OooO0OO;
                    Oooo00O.o000000O.OooO0oo(o000oooo2);
                    o00O00OO o00o00oo = (o00O00OO) o000oooo2.f29640OooO00o.f30487OooOo0o;
                    o00o00oo.getClass();
                    o00o00oo.OooO0OO(new o00O000(o00o00oo, z));
                }
                return;
            case 4:
                o0O00OOO o0o00ooo = (o0O00OOO) this.f28802OooOo0o;
                Process.setThreadPriority(o0o00ooo.f29699OooO0OO);
                StrictMode.ThreadPolicy threadPolicy = o0o00ooo.f29700OooO0Oo;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f28800OooOo).run();
                return;
            case 5:
                Callable callable = (Callable) this.f28802OooOo0o;
                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) ((o000Ooo0.OooOO0) this.f28800OooOo).f30538OooOo0o;
                try {
                    o0o0o0oo.set(callable.call());
                    return;
                } catch (Exception e) {
                    o0o0o0oo.setException(e);
                    return;
                }
            case 6:
                o000OO0O.OooO0OO oooO0OO = (o000OO0O.OooO0OO) this.f28802OooOo0o;
                oooO0OO.getClass();
                try {
                    OooOOo0.o0Oo0oo.OooO00o().f13526OooO0Oo.OooO00o(((OooOOo0.OooOo) oooO0OO.f30214OooO0oo.f13518OooOo0o).OooO00o(OooOOO.OooO0OO.f13316OooOo), 1);
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.f28800OooOo).countDown();
                return;
            case 7:
                o000O0Oo.OooO0o oooO0o = (o000O0Oo.OooO0o) this.f28802OooOo0o;
                ((o000Oo0.OooOOO0) oooO0o.f30136OooOo).OooO((String) oooO0o.f30138OooOo0o, (List) this.f28800OooOo);
                return;
            case 8:
                ((o000Ooo.o0OOO0o) this.f28802OooOo0o).OooO0OO((String) this.f28800OooOo, Boolean.FALSE);
                return;
            case 9:
                o000Ooo.o000000 o000000Var = (o000Ooo.o000000) this.f28802OooOo0o;
                String str = (String) this.f28800OooOo;
                o000O0Oo.OooO0o oooO0o2 = o000000Var.f30440OooO0oo.f30501OooO0Oo;
                oooO0o2.getClass();
                String strOooO00o = o000Oo0.OooO.OooO00o(1024, str);
                synchronized (((AtomicMarkableReference) oooO0o2.f30142OooOoo)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) oooO0o2.f30142OooOoo).getReference();
                        if (strOooO00o == null ? str2 == null : strOooO00o.equals(str2)) {
                            return;
                        }
                        ((AtomicMarkableReference) oooO0o2.f30142OooOoo).set(strOooO00o, true);
                        ((o000O0O.OooO) oooO0o2.f30140OooOoO0).f30100OooO0O0.OooO00o(new OooOo0o.o000oOoO(oooO0o2, 24));
                        return;
                    } finally {
                    }
                }
            case 10:
                LevelPlayNativeAd.m10057a((LevelPlayNativeAd) this.f28802OooOo0o, (IronSourceError) this.f28800OooOo);
                return;
            case 11:
                ((o000o0oO.Oooo000) this.f28802OooOo0o).f30970OooO00o.success(this.f28800OooOo);
                return;
            case 12:
                ((o000O00O) this.f28802OooOo0o).f31002OooO00o.success(this.f28800OooOo);
                return;
            case 13:
                o000oo0.o0ooOOo o0ooooo = (o000oo0.o0ooOOo) this.f28802OooOo0o;
                o0ooooo.getClass();
                o000oo0.o00oO0o o00oo0o = (o000oo0.o00oO0o) this.f28800OooOo;
                o00oo0o.f31043OooO0O0.run();
                o0ooooo.f31059OooO0o = o00oo0o;
                o0ooooo.f31060OooO0o0.run();
                return;
            case 14:
                OooO00o();
                return;
            case 15:
                Store.lambda$isFeatureSupported$0((Integer) this.f28802OooOo0o, (String) this.f28800OooOo);
                return;
            case 16:
                ExternalEmbedder.lambda$multiThreadedStreamCopy$0((InputStream) this.f28802OooOo0o, (OutputStream) this.f28800OooOo);
                return;
            case 17:
                ExternalParser.lambda$sendInput$1((Process) this.f28802OooOo0o, (InputStream) this.f28800OooOo);
                return;
            default:
                ((AsyncProcessor) this.f28802OooOo0o).lambda$startCounter$1((TotalCounter) this.f28800OooOo);
                return;
        }
    }
}
