package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.w */
/* loaded from: classes2.dex */
public abstract class AbstractC2930w<T> extends AbstractC2931x<WebView, T> {

    /* renamed from: ﻐ */
    private InterfaceC2875iq f7394;

    /* renamed from: ﾇ */
    private AbstractViewOnLayoutChangeListenerC2644ab f7396;

    /* renamed from: ﾒ */
    private Map<T, AbstractViewOnLayoutChangeListenerC2644ab> f7397 = new WeakHashMap();

    /* renamed from: ｋ */
    private AbstractC2930w<T>.e f7395 = new e();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.w$e */
    public class e {

        /* renamed from: ﭴ */
        private boolean f7408;

        /* renamed from: ﮐ */
        private boolean f7409;

        /* renamed from: ﱟ */
        private boolean f7410;

        /* renamed from: ﱡ */
        private boolean f7411;

        /* renamed from: ﺙ */
        private boolean f7412;

        /* renamed from: ﻏ */
        private boolean f7413;

        /* renamed from: ﻐ */
        private boolean f7414;

        /* renamed from: ﻛ */
        private String f7415;

        /* renamed from: ｋ */
        private boolean f7416;

        /* renamed from: ﾇ */
        protected List<String> f7417 = new ArrayList();

        /* renamed from: ﾒ */
        private List<String> f7418;

        /* renamed from: ﱟ */
        public final AbstractC2930w<T>.e m7661(boolean z) {
            this.f7413 = z;
            return this;
        }

        /* renamed from: ﱡ */
        public final AbstractC2930w<T>.e m7662(boolean z) {
            this.f7409 = z;
            return this;
        }

        /* renamed from: ﺙ */
        public final AbstractC2930w<T>.e m7663(boolean z) {
            this.f7408 = z;
            return this;
        }

        /* renamed from: ﻐ */
        public final AbstractC2930w<T>.e m7664(boolean z) {
            this.f7411 = z;
            return this;
        }

        /* renamed from: ﻛ */
        public final AbstractC2930w<T>.e m7666(boolean z) {
            this.f7410 = z;
            return this;
        }

        /* renamed from: ｋ */
        public final AbstractC2930w<T>.e m7667(String str) {
            this.f7415 = str;
            return this;
        }

        /* renamed from: ﾇ */
        public final AbstractC2930w<T>.e m7670(boolean z) {
            this.f7412 = z;
            return this;
        }

        /* renamed from: ﾒ */
        public final AbstractC2930w<T>.e m7671(boolean z) {
            this.f7414 = z;
            return this;
        }

        /* renamed from: ﻛ */
        public final AbstractC2930w<T>.e m7665(List<String> list) {
            if (list != null) {
                this.f7417 = list;
            }
            return this;
        }

        /* renamed from: ｋ */
        public final AbstractC2930w<T>.e m7668(List<String> list) {
            this.f7418 = list;
            return this;
        }

        /* renamed from: ｋ */
        public final AbstractC2930w<T>.e m7669(boolean z) {
            this.f7416 = z;
            return this;
        }
    }

    public AbstractC2930w(InterfaceC2875iq interfaceC2875iq) {
        this.f7394 = interfaceC2875iq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾇ */
    public void m7644(T t, List<WebView> list) {
        (((e) this.f7395).f7413 ? this.f7397.get(t) : this.f7396).m4938(list);
        if (((e) this.f7395).f7416) {
            (((e) this.f7395).f7413 ? this.f7397.get(t) : this.f7396).m4940(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* renamed from: ﻐ */
    public void mo7625(T t, String str) throws JSONException {
        m7648(new JSONObject(), (JSONObject) t, str);
    }

    /* renamed from: ﻛ */
    public abstract InterfaceC2923p<WebView, T> mo4904();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ｋ */
    public final /* synthetic */ void mo4939(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        super.mo4932(jSONObject, (WebView) obj, obj2);
    }

    /* renamed from: ﾇ */
    public abstract View mo4906(T t);

    /* renamed from: ﾒ */
    public abstract AbstractViewOnLayoutChangeListenerC2644ab mo4908();

    /* renamed from: ﾒ */
    public abstract void mo4909(T t, List<WebView> list);

    /* renamed from: ﻐ */
    public void mo7624(T t) throws JSONException {
        mo6307(new JSONObject(), (((e) this.f7395).f7413 ? this.f7397.get(t) : this.f7396).m4941(), t);
    }

    /* renamed from: ｋ */
    public final void m7647(AbstractC2930w<T>.e eVar) {
        this.f7395 = eVar;
    }

    /* renamed from: ﾒ */
    public final void m7649(InterfaceC2875iq interfaceC2875iq) {
        this.f7394 = interfaceC2875iq;
    }

    /* renamed from: ｋ */
    public final void m7648(final JSONObject jSONObject, final T t, String str) throws JSONException {
        AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644abMo4908;
        boolean z = ((e) this.f7395).f7414 && !TextUtils.isEmpty(((e) this.f7395).f7415);
        if (((e) this.f7395).f7413) {
            abstractViewOnLayoutChangeListenerC2644abMo4908 = this.f7397.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC2644abMo4908 = this.f7396;
        }
        if (abstractViewOnLayoutChangeListenerC2644abMo4908 == null) {
            abstractViewOnLayoutChangeListenerC2644abMo4908 = mo4908();
            if (((e) this.f7395).f7413) {
                this.f7397.put(t, abstractViewOnLayoutChangeListenerC2644abMo4908);
            } else {
                this.f7396 = abstractViewOnLayoutChangeListenerC2644abMo4908;
            }
            abstractViewOnLayoutChangeListenerC2644abMo4908.m7677(mo4904());
        }
        AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab = abstractViewOnLayoutChangeListenerC2644abMo4908;
        abstractViewOnLayoutChangeListenerC2644ab.m4934();
        abstractViewOnLayoutChangeListenerC2644ab.m4937(((e) this.f7395).f7415, ((e) this.f7395).f7418, z, ((e) this.f7395).f7411, ((e) this.f7395).f7409);
        abstractViewOnLayoutChangeListenerC2644ab.m4940(str);
        if (!((e) this.f7395).f7410) {
            super.mo4939(jSONObject, (JSONObject) null, t);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo4909((AbstractC2930w<T>) t, (List<WebView>) arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        InterfaceC2875iq interfaceC2875iq = this.f7394;
        if (interfaceC2875iq != null) {
            arrayList2 = interfaceC2875iq.mo6339(t);
        }
        final List<WebView> listM7343 = C2906ju.m7343(arrayList, arrayList2);
        if (listM7343.isEmpty() || ((e) this.f7395).f7412) {
            View viewMo4906 = mo4906((AbstractC2930w<T>) t);
            if (viewMo4906 != null) {
                viewMo4906.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.w.2

                    /* renamed from: ﱡ */
                    private static int f7398 = 1;

                    /* renamed from: ﾇ */
                    private static int f7400;

                    /* renamed from: ﻐ */
                    private static char[] f7399 = {9414, 25138, 43362, 61625, 16367, 17664, 35928, 52116, 4829, 22545, 59143, 11881, 30108, 48378, 64012, 333, 18588, 38866, 56588, 19589, 2677, 49468, 39162, 22446, 11523, 58371, 41951, 31448, 12368, 36712, 17921, 7669, 54434, 37453, 26908, 8388, 65460, 46422, 3172, 52002, 33524, 22975};

                    /* renamed from: ﾒ */
                    private static long f7401 = 4886772979458262727L;

                    /* renamed from: ﻛ */
                    private static String m7650(int i, char c, int i2) {
                        String str2;
                        synchronized (C2642a.f4435) {
                            try {
                                char[] cArr = new char[i2];
                                C2642a.f4436 = 0;
                                while (true) {
                                    int i3 = C2642a.f4436;
                                    if (i3 < i2) {
                                        cArr[i3] = (char) ((f7399[i + i3] ^ (i3 * f7401)) ^ c);
                                        C2642a.f4436 = i3 + 1;
                                    } else {
                                        str2 = new String(cArr);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str2;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            AbstractC2930w.this.mo4909((AbstractC2930w) t, (List<WebView>) arrayList3);
                            if (!arrayList3.isEmpty()) {
                                f7398 = (f7400 + 21) % 128;
                                View viewMo49062 = AbstractC2930w.this.mo4906((AbstractC2930w) t);
                                if (viewMo49062 != null) {
                                    int i9 = f7400 + 39;
                                    f7398 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        boolean unused = AbstractC2930w.this.f7395.f7412;
                                        throw null;
                                    }
                                    if (!AbstractC2930w.this.f7395.f7412) {
                                        viewMo49062.removeOnLayoutChangeListener(this);
                                    }
                                }
                                AbstractC2930w.this.m7644(t, arrayList3);
                                AbstractC2930w.this.mo6316(new JSONObject(), (JSONObject) arrayList3.get(0), t);
                            }
                            int i10 = f7398 + 69;
                            f7400 = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 25 / 0;
                            }
                        } catch (Throwable th) {
                            C2914kb.m7426(m7650(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (Color.argb(0, 0, 0, 0) + 9344), 18 - ImageFormat.getBitsPerPixel(0)).intern(), m7650(TextUtils.getOffsetAfter("", 0) + 19, (char) (19648 - KeyEvent.normalizeMetaState(0)), 23 - TextUtils.indexOf("", "", 0)).intern(), th, false);
                        }
                    }
                });
            }
            if (listM7343.isEmpty()) {
                super.mo4939(jSONObject, (JSONObject) null, t);
                return;
            }
        }
        if (!((e) this.f7395).f7408) {
            m7644(t, listM7343);
            super.mo4939(jSONObject, (JSONObject) listM7343.get(0), (WebView) t);
        } else {
            C2926s.m7595().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.w.4
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    AbstractC2930w.this.m7644(t, listM7343);
                    AbstractC2930w.super.mo4939(jSONObject, (JSONObject) listM7343.get(0), (WebView) t);
                }
            });
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x
    /* renamed from: ｋ */
    public final String mo4935(T t) {
        AbstractViewOnLayoutChangeListenerC2644ab abstractViewOnLayoutChangeListenerC2644ab;
        if (((e) this.f7395).f7413) {
            abstractViewOnLayoutChangeListenerC2644ab = this.f7397.get(t);
        } else {
            abstractViewOnLayoutChangeListenerC2644ab = this.f7396;
        }
        return abstractViewOnLayoutChangeListenerC2644ab.mo4935((AbstractViewOnLayoutChangeListenerC2644ab) t);
    }
}
