package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.C3034d9;
import com.ironsource.InterfaceC2936ag;
import com.ironsource.InterfaceC3072ec;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.u7 */
/* loaded from: classes2.dex */
public abstract class AbstractC3724u7 implements InterfaceC3903zf {

    /* renamed from: A */
    private int[] f12163A;

    /* renamed from: B */
    private int[] f12164B;

    /* renamed from: C */
    private int[] f12165C;

    /* renamed from: G */
    int f12169G;

    /* renamed from: H */
    String f12170H;

    /* renamed from: I */
    String f12171I;

    /* renamed from: J */
    Set<Integer> f12172J;

    /* renamed from: K */
    private HandlerThreadC3002cc f12173K;

    /* renamed from: L */
    private IronSourceSegment f12174L;

    /* renamed from: M */
    private C3606rt f12175M;

    /* renamed from: N */
    private ISErrorListener f12176N;

    /* renamed from: l */
    private boolean f12189l;

    /* renamed from: p */
    private C3110fa f12193p;

    /* renamed from: q */
    private AbstractC3059e f12194q;

    /* renamed from: r */
    private ArrayList<C3899zb> f12195r;

    /* renamed from: t */
    private int f12197t;

    /* renamed from: u */
    private InterfaceC3118fi f12198u;

    /* renamed from: v */
    private Context f12199v;

    /* renamed from: z */
    private int[] f12203z;

    /* renamed from: a */
    final int f12178a = 1;

    /* renamed from: b */
    final int f12179b = 100;

    /* renamed from: c */
    final int f12180c = 5000;

    /* renamed from: d */
    final int f12181d = 90000;

    /* renamed from: e */
    final int f12182e = 1024;

    /* renamed from: f */
    final int f12183f = 5;

    /* renamed from: g */
    final String f12184g = "supersonic_sdk.db";

    /* renamed from: h */
    final String f12185h = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: i */
    final String f12186i = "placement";

    /* renamed from: j */
    private final String f12187j = C3451ne.f10432N0;

    /* renamed from: k */
    private final String f12188k = C3451ne.f10454Y0;

    /* renamed from: m */
    private boolean f12190m = false;

    /* renamed from: n */
    private boolean f12191n = false;

    /* renamed from: o */
    private int f12192o = -1;

    /* renamed from: s */
    private boolean f12196s = true;

    /* renamed from: w */
    private int f12200w = 100;

    /* renamed from: x */
    private int f12201x = 5000;

    /* renamed from: y */
    private int f12202y = 1;

    /* renamed from: D */
    private Map<String, String> f12166D = new HashMap();

    /* renamed from: E */
    private Map<String, String> f12167E = new HashMap();

    /* renamed from: F */
    private String f12168F = "";

    /* renamed from: O */
    private final Object f12177O = new Object();

    /* renamed from: com.ironsource.u7$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3724u7.this.m12564a();
        }
    }

    /* renamed from: com.ironsource.u7$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3899zb f12205a;

        /* renamed from: b */
        final /* synthetic */ IronSource.AD_UNIT f12206b;

        public b(C3899zb c3899zb, IronSource.AD_UNIT ad_unit) {
            this.f12205a = c3899zb;
            this.f12206b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            this.f12205a.m13321a("eventSessionId", AbstractC3724u7.this.f12198u.mo8700b());
            this.f12205a.m13321a("essn", Integer.valueOf(AbstractC3724u7.this.f12198u.mo8701c()));
            String connectionType = IronSourceUtils.getConnectionType(AbstractC3724u7.this.f12199v);
            if (AbstractC3724u7.this.mo9694g(this.f12205a)) {
                this.f12205a.m13321a(C3034d9.i.f8208t, connectionType);
            }
            if (AbstractC3724u7.this.m12576a(connectionType, this.f12205a)) {
                C3899zb c3899zb = this.f12205a;
                c3899zb.m13319a(AbstractC3724u7.this.m12578b(c3899zb));
            }
            String strM4801d = C2635a9.m4801d(AbstractC3724u7.this.f12199v);
            if (strM4801d != null) {
                this.f12205a.m13321a(C3034d9.i.f8209u, strM4801d);
            }
            int iM12558a = AbstractC3724u7.this.m12558a(this.f12205a.m13323c(), this.f12206b);
            if (iM12558a != e.NOT_SUPPORTED.m12631a()) {
                this.f12205a.m13321a("adUnit", Integer.valueOf(iM12558a));
            }
            AbstractC3724u7.this.m12567a(this.f12205a, "reason");
            AbstractC3724u7.this.m12567a(this.f12205a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC3724u7.this.f12167E.isEmpty()) {
                for (Map.Entry entry : AbstractC3724u7.this.f12167E.entrySet()) {
                    if (!this.f12205a.m13322b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f12205a.m13321a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC3724u7.this.m12594i(this.f12205a)) {
                if (AbstractC3724u7.this.mo9695h(this.f12205a) && !AbstractC3724u7.this.m12586e(this.f12205a)) {
                    this.f12205a.m13321a("sessionDepth", Integer.valueOf(AbstractC3724u7.this.mo8392c(this.f12205a)));
                }
                if (AbstractC3724u7.this.mo8397j(this.f12205a)) {
                    AbstractC3724u7.this.mo8396f(this.f12205a);
                }
                long jMo8699a = AbstractC3724u7.this.f12198u.mo8699a();
                if (jMo8699a > 0) {
                    this.f12205a.m13321a("firstSessionTimestamp", Long.valueOf(jMo8699a));
                }
                IronLog.EVENT.verbose(this.f12205a.toString());
                AbstractC3724u7.this.f12195r.add(this.f12205a);
                AbstractC3724u7.m12585d(AbstractC3724u7.this);
            }
            AbstractC3724u7 abstractC3724u7 = AbstractC3724u7.this;
            boolean zM12570a = abstractC3724u7.m12577a(abstractC3724u7.f12164B) ? AbstractC3724u7.this.m12570a(this.f12205a.m13323c(), AbstractC3724u7.this.f12164B) : AbstractC3724u7.this.mo8394d(this.f12205a);
            if (!AbstractC3724u7.this.f12190m && zM12570a) {
                AbstractC3724u7.this.f12190m = true;
            }
            if (AbstractC3724u7.this.f12193p != null) {
                if (AbstractC3724u7.this.m12591g()) {
                    AbstractC3724u7.this.m12588f();
                    return;
                }
                AbstractC3724u7 abstractC3724u72 = AbstractC3724u7.this;
                if (abstractC3724u72.m12582b((ArrayList<C3899zb>) abstractC3724u72.f12195r) || zM12570a) {
                    AbstractC3724u7.this.m12564a();
                }
            }
        }
    }

    /* renamed from: com.ironsource.u7$c */
    public class c implements InterfaceC2936ag {
        public c() {
        }

        /* renamed from: b */
        public /* synthetic */ void m12629b(InterfaceC2936ag.a aVar) {
            try {
                if (aVar.m7764c()) {
                    ArrayList<C3899zb> arrayListMo7919a = AbstractC3724u7.this.f12193p.mo7919a(AbstractC3724u7.this.f12171I);
                    AbstractC3724u7.this.f12197t = arrayListMo7919a.size() + AbstractC3724u7.this.f12195r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC3724u7.this.mo9693a(AbstractC3724u7.this.m12563a(aVar.m7763b(), aVar.m7762a()));
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                if (AbstractC3724u7.this.f12176N != null) {
                    AbstractC3724u7.this.f12176N.onError(new IllegalStateException("Error on sending data ", e));
                }
            }
            m12630a(aVar.m7763b());
        }

        @Override // com.ironsource.InterfaceC2936ag
        /* renamed from: a */
        public synchronized void mo7758a(InterfaceC2936ag.a aVar) {
            AbstractC3724u7.this.f12173K.m8109a(new o00000O0(1, this, aVar));
        }

        /* renamed from: a */
        public void m12630a(ArrayList<C3899zb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                    IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.ironsource.u7$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3724u7.this.m12588f();
        }
    }

    /* renamed from: com.ironsource.u7$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a */
        private int f12216a;

        e(int i) {
            this.f12216a = i;
        }

        /* renamed from: a */
        public int m12631a() {
            return this.f12216a;
        }
    }

    /* renamed from: a */
    public int m12558a(int i, IronSource.AD_UNIT ad_unit) {
        e eVar;
        int iM12631a = e.NOT_SUPPORTED.m12631a();
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000))) {
            eVar = e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000))) {
            eVar = e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
            eVar = e.BANNER;
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i < 4000 || i >= 5000) && (i < 94000 || i >= 95000))) {
                return iM12631a;
            }
            eVar = e.NATIVE_AD;
        }
        return eVar.m12631a();
    }

    /* renamed from: b */
    public synchronized int m12578b(C3899zb c3899zb) {
        return c3899zb.m13323c() + 90000;
    }

    /* renamed from: d */
    public static /* synthetic */ int m12585d(AbstractC3724u7 abstractC3724u7) {
        int i = abstractC3724u7.f12197t;
        abstractC3724u7.f12197t = i + 1;
        return i;
    }

    /* renamed from: c */
    public abstract int mo8392c(C3899zb c3899zb);

    /* renamed from: d */
    public abstract void mo8393d();

    /* renamed from: d */
    public abstract boolean mo8394d(C3899zb c3899zb);

    /* renamed from: e */
    public abstract String mo8395e(int i);

    /* renamed from: e */
    public void m12626e() {
        this.f12195r = new ArrayList<>();
        this.f12197t = 0;
        this.f12194q = C3182hc.m9111a(this.f12170H, this.f12169G);
        HandlerThreadC3002cc handlerThreadC3002cc = new HandlerThreadC3002cc(OooO0oO.OooOo.OooOOOo(new StringBuilder(), this.f12171I, "EventThread"));
        this.f12173K = handlerThreadC3002cc;
        handlerThreadC3002cc.start();
        this.f12173K.m8108a();
        this.f12198u = C3495on.m11199U().mo8687h();
        this.f12172J = new HashSet();
        mo8393d();
    }

    /* renamed from: f */
    public int m12627f(int i) {
        return m12558a(i, (IronSource.AD_UNIT) null);
    }

    /* renamed from: f */
    public abstract void mo8396f(C3899zb c3899zb);

    /* renamed from: h */
    public void m12628h() {
        this.f12173K.m8109a(new d());
    }

    /* renamed from: j */
    public abstract boolean mo8397j(C3899zb c3899zb);

    /* renamed from: f */
    public void m12588f() {
        ArrayList<C3899zb> arrayListMo7919a;
        try {
            this.f12190m = false;
            ArrayList<C3899zb> arrayList = new ArrayList<>();
            try {
                synchronized (this.f12177O) {
                    arrayListMo7919a = this.f12193p.mo7919a(this.f12171I);
                    this.f12193p.mo7921b(this.f12171I);
                }
                InterfaceC3072ec.c cVar = new InterfaceC3072ec.c(new InterfaceC3072ec.a(arrayListMo7919a, this.f12195r), this.f12201x);
                this.f12193p.mo7920a(cVar.m8466a(), this.f12171I);
                arrayList.addAll(cVar.m8467b());
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.f12176N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.f12195r);
            }
            if (arrayList.size() > 0) {
                this.f12195r.clear();
                this.f12197t = 0;
                JSONObject jSONObjectM9665b = C3288ke.m9661a().m9665b();
                try {
                    m12569a(jSONObjectM9665b);
                    String strM12614b = m12614b();
                    if (!TextUtils.isEmpty(strM12614b)) {
                        jSONObjectM9665b.put(C3451ne.f10432N0, strM12614b);
                    }
                    String strM10558n = C3404p.m10470j().m10558n();
                    if (!TextUtils.isEmpty(strM10558n)) {
                        jSONObjectM9665b.put(C3451ne.f10454Y0, strM10558n);
                    }
                    Map<String, String> mapM12620c = m12620c();
                    if (!mapM12620c.isEmpty()) {
                        for (Map.Entry<String, String> entry : mapM12620c.entrySet()) {
                            if (!jSONObjectM9665b.has(entry.getKey())) {
                                jSONObjectM9665b.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject jSONObjectM9474a = new C3251jc().m9474a();
                    Iterator<String> itKeys = jSONObjectM9474a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObjectM9665b.put(next, jSONObjectM9474a.get(next));
                    }
                } catch (Throwable th2) {
                    C3551q9.m11517d().m11519a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String strMo8426a = this.f12194q.mo8426a(arrayList, jSONObjectM9665b);
                if (TextUtils.isEmpty(strMo8426a)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.f12176N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.f12191n) {
                    try {
                        strMo8426a = Base64.encodeToString(C3120fk.m8713a(strMo8426a, this.f12192o), 0);
                    } catch (Exception e2) {
                        C3551q9.m11517d().m11519a(e2);
                        ISErrorListener iSErrorListener3 = this.f12176N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e2));
                        }
                    }
                }
                C2986bv.f7654a.m8033a(new RunnableC3286kc(new c(), strMo8426a, this.f12194q.m8430b(), arrayList));
            }
        } catch (Throwable th3) {
            C3551q9.m11517d().m11519a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* renamed from: g */
    public boolean m12591g() {
        return (this.f12197t >= this.f12200w || this.f12190m) && this.f12189l;
    }

    /* renamed from: i */
    public boolean m12594i(C3899zb c3899zb) {
        if (c3899zb == null) {
            return false;
        }
        if (m12577a(this.f12203z)) {
            return !m12570a(c3899zb.m13323c(), this.f12203z);
        }
        if (m12577a(this.f12163A)) {
            return m12570a(c3899zb.m13323c(), this.f12163A);
        }
        return true;
    }

    /* renamed from: c */
    public Map<String, String> m12620c() {
        return this.f12166D;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: d */
    public void mo12624d(int i) {
        this.f12192o = i;
    }

    /* renamed from: b */
    public String m12614b() {
        return this.f12168F;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: c */
    public void mo12621c(int i) {
        if (i > 0) {
            this.f12202y = i;
        }
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: d */
    public void mo12625d(int[] iArr, Context context) {
        this.f12165C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f12171I, iArr);
    }

    /* renamed from: g */
    public boolean mo9694g(C3899zb c3899zb) {
        return (c3899zb.m13323c() == EnumC2638ac.CONSENT_TRUE_CODE.m4887b() || c3899zb.m13323c() == EnumC2638ac.CONSENT_FALSE_CODE.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_META_DATA.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_META_DATA_AFTER_INIT.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_USER_ID.m4887b()) ? false : true;
    }

    /* renamed from: h */
    public boolean mo9695h(C3899zb c3899zb) {
        return (c3899zb.m13323c() == EnumC2638ac.FIRST_INSTANCE.m4887b() || c3899zb.m13323c() == EnumC2638ac.FIRST_INSTANCE_RESULT.m4887b() || c3899zb.m13323c() == EnumC2638ac.INIT_COMPLETE.m4887b() || c3899zb.m13323c() == EnumC2638ac.SDK_INIT_FAILED.m4887b() || c3899zb.m13323c() == EnumC2638ac.SDK_INIT_SUCCESS.m4887b() || c3899zb.m13323c() == EnumC2638ac.USING_CACHE_FOR_INIT_EVENT.m4887b() || c3899zb.m13323c() == EnumC2638ac.CONSENT_TRUE_CODE.m4887b() || c3899zb.m13323c() == EnumC2638ac.CONSENT_FALSE_CODE.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_META_DATA.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_META_DATA_AFTER_INIT.m4887b() || c3899zb.m13323c() == EnumC2638ac.SET_USER_ID.m4887b()) ? false : true;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: b */
    public void mo12615b(int i) {
        if (i > 0) {
            this.f12200w = i;
        }
    }

    /* renamed from: c */
    public void m12622c(boolean z) {
        this.f12189l = z;
    }

    /* renamed from: b */
    private void m12580b(String str) {
        AbstractC3059e abstractC3059e = this.f12194q;
        if (abstractC3059e == null || !abstractC3059e.mo8431c().equals(str)) {
            this.f12194q = C3182hc.m9111a(str, this.f12169G);
        }
    }

    /* renamed from: a */
    public String m12599a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: c */
    public void mo12623c(int[] iArr, Context context) {
        this.f12203z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f12171I, iArr);
    }

    /* renamed from: e */
    public boolean m12586e(C3899zb c3899zb) {
        JSONObject jSONObjectM13322b = c3899zb.m13322b();
        if (jSONObjectM13322b == null) {
            return false;
        }
        return jSONObjectM13322b.has("sessionDepth");
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: b */
    public void mo12616b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC3059e abstractC3059e = this.f12194q;
        if (abstractC3059e != null) {
            abstractC3059e.m8429a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.f12171I, str);
    }

    /* renamed from: a */
    public ArrayList<C3899zb> m12563a(ArrayList<C3899zb> arrayList, String str) throws JSONException {
        String strM12599a = m12599a(str, 1024);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3899zb c3899zb = arrayList.get(i);
            i++;
            c3899zb.m13320a(strM12599a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m12617b(Map<String, String> map) {
        this.f12167E.putAll(map);
    }

    /* renamed from: a */
    public void m12564a() {
        synchronized (this.f12177O) {
            this.f12193p.mo7920a(this.f12195r, this.f12171I);
            this.f12195r.clear();
        }
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: b */
    public void mo12618b(boolean z) {
        this.f12196s = z;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: a */
    public void mo12600a(int i) {
        if (i > 0) {
            this.f12201x = i;
        }
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: b */
    public void mo12619b(int[] iArr, Context context) {
        this.f12164B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f12171I, iArr);
    }

    /* renamed from: a */
    public synchronized void m12601a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f12171I, this.f12170H);
        this.f12170H = defaultEventsFormatterType;
        m12580b(defaultEventsFormatterType);
        this.f12194q.m8429a(IronSourceUtils.getDefaultEventsURL(context, this.f12171I, null));
        this.f12193p = C3110fa.m8656a(context, "supersonic_sdk.db", 5);
        this.f12173K.m8109a(new a());
        this.f12203z = IronSourceUtils.getDefaultOptOutEvents(context, this.f12171I);
        this.f12163A = IronSourceUtils.getDefaultOptInEvents(context, this.f12171I);
        this.f12164B = IronSourceUtils.getDefaultTriggerEvents(context, this.f12171I);
        this.f12165C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f12171I);
        this.f12174L = ironSourceSegment;
        this.f12199v = context;
    }

    /* renamed from: b */
    public boolean m12582b(ArrayList<C3899zb> arrayList) {
        return arrayList != null && arrayList.size() >= this.f12202y;
    }

    /* renamed from: a */
    public void m12602a(IronSourceSegment ironSourceSegment) {
        this.f12174L = ironSourceSegment;
    }

    /* renamed from: a */
    public void m12603a(ISErrorListener iSErrorListener) {
        this.f12176N = iSErrorListener;
    }

    /* renamed from: a */
    public synchronized void m12604a(C3606rt c3606rt) {
        this.f12175M = c3606rt;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: a */
    public synchronized void mo12605a(C3899zb c3899zb) {
        m12606a(c3899zb, (IronSource.AD_UNIT) null);
    }

    /* renamed from: a */
    public synchronized void m12606a(C3899zb c3899zb, IronSource.AD_UNIT ad_unit) {
        if (c3899zb != null) {
            if (this.f12196s) {
                this.f12173K.m8109a(new b(c3899zb, ad_unit));
            }
        }
    }

    /* renamed from: a */
    public void m12567a(C3899zb c3899zb, String str) {
        m12568a(c3899zb, str, 1024);
    }

    /* renamed from: a */
    private void m12568a(C3899zb c3899zb, String str, int i) {
        JSONObject jSONObjectM13322b = c3899zb.m13322b();
        if (jSONObjectM13322b == null || !jSONObjectM13322b.has(str)) {
            return;
        }
        try {
            c3899zb.m13321a(str, m12599a(jSONObjectM13322b.optString(str, null), i));
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    /* renamed from: a */
    public void m12607a(Runnable runnable) {
        this.f12173K.m8109a(runnable);
    }

    /* renamed from: a */
    public void m12608a(String str) {
        this.f12168F = str;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: a */
    public void mo12609a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f12170H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.f12171I, str);
        m12580b(str);
    }

    /* renamed from: a */
    public void mo9693a(ArrayList<C3899zb> arrayList) {
        if (arrayList != null) {
            synchronized (this.f12177O) {
                this.f12193p.mo7920a(arrayList, this.f12171I);
                this.f12197t = this.f12193p.mo7919a(this.f12171I).size() + this.f12195r.size();
            }
        }
    }

    /* renamed from: a */
    public void m12610a(Map<String, String> map) {
        this.f12166D.putAll(map);
    }

    /* renamed from: a */
    public void m12611a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    /* renamed from: a */
    private void m12569a(JSONObject jSONObject) throws JSONException {
        try {
            IronSourceSegment ironSourceSegment = this.f12174L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(IronSourceSegment.AGE, this.f12174L.getAge());
                }
                if (!TextUtils.isEmpty(this.f12174L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.f12174L.getGender());
                }
                if (this.f12174L.getLevel() > 0) {
                    jSONObject.put("lvl", this.f12174L.getLevel());
                }
                if (this.f12174L.getIsPaying() != null) {
                    jSONObject.put("pay", this.f12174L.getIsPaying().get());
                }
                if (this.f12174L.getIapt() > 0.0d) {
                    jSONObject.put("iapt", this.f12174L.getIapt());
                }
                if (this.f12174L.getUcd() > 0) {
                    jSONObject.put("ucd", this.f12174L.getUcd());
                }
            }
            C3606rt c3606rt = this.f12175M;
            if (c3606rt != null) {
                String strM11763b = c3606rt.m11763b();
                if (!TextUtils.isEmpty(strM11763b)) {
                    jSONObject.put("segmentId", strM11763b);
                }
                JSONObject jSONObjectM11762a = this.f12175M.m11762a();
                Iterator<String> itKeys = jSONObjectM11762a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM11762a.get(next));
                }
            }
        } catch (JSONException e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: a */
    public void mo12612a(boolean z) {
        this.f12191n = z;
    }

    @Override // com.ironsource.InterfaceC3903zf
    /* renamed from: a */
    public void mo12613a(int[] iArr, Context context) {
        this.f12163A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f12171I, iArr);
    }

    /* renamed from: a */
    public boolean m12570a(int i, int[] iArr) {
        if (m12577a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean m12576a(String str, C3899zb c3899zb) {
        try {
            if (str.equalsIgnoreCase("none")) {
                return m12577a(this.f12165C) ? m12570a(c3899zb.m13323c(), this.f12165C) : this.f12172J.contains(Integer.valueOf(c3899zb.m13323c()));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public boolean m12577a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }
}
