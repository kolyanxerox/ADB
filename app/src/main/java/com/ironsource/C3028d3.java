package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C3395l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ironsource.d3 */
/* loaded from: classes2.dex */
public final class C3028d3 {

    /* renamed from: b */
    public static final a f7872b = new a(null);

    /* renamed from: c */
    private static final int f7873c = -1;

    /* renamed from: a */
    private final C3240j1 f7874a;

    /* renamed from: com.ironsource.d3$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: com.ironsource.d3$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o00Oo0oo.o00oO0o.OooO0Oo(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
        }
    }

    /* renamed from: com.ironsource.d3$c */
    public static final class c<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ Comparator f7875a;

        public c(Comparator comparator) {
            this.f7875a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f7875a.compare(t, t2);
            return iCompare != 0 ? iCompare : o00Oo0oo.o00oO0o.OooO0Oo(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
        }
    }

    public C3028d3(C3240j1 adSizeTools) {
        kotlin.jvm.internal.OooOo.OooO0o0(adSizeTools, "adSizeTools");
        this.f7874a = adSizeTools;
    }

    /* renamed from: a */
    private final int m8260a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C3240j1.m9406a(this.f7874a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        } else if (num != null) {
            return num.intValue();
        }
        return C2966bb.f7584a.m7901b(context);
    }

    /* renamed from: a */
    public final LevelPlayAdSize m8263a(Context context, Integer num) {
        IronLog ironLog;
        C3240j1 c3240j1;
        String str;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        if (this.f7874a.m9414d()) {
            Integer numM9412b = this.f7874a.m9412b(context);
            if (numM9412b != null) {
                int iIntValue = numM9412b.intValue();
                int iM8260a = m8260a(num, context);
                int iM9409a = this.f7874a.m9409a(iM8260a);
                List<LevelPlayAdSize> listM8261a = m8261a();
                for (LevelPlayAdSize levelPlayAdSizeCreateCustomSize : m8262a(listM8261a, iIntValue, iM8260a)) {
                    if (levelPlayAdSizeCreateCustomSize.getWidth() <= iM8260a && (levelPlayAdSizeCreateCustomSize.getHeight() <= iM9409a || iM9409a == -1)) {
                        iM9409a = Math.max(iM9409a, levelPlayAdSizeCreateCustomSize.getHeight());
                        break;
                    }
                }
                levelPlayAdSizeCreateCustomSize = null;
                if (levelPlayAdSizeCreateCustomSize == null) {
                    iM9409a = ((LevelPlayAdSize) o00O0.OooOo00.Oooo000(listM8261a)).getHeight();
                    levelPlayAdSizeCreateCustomSize = LevelPlayAdSize.Companion.createCustomSize(iM8260a, iM9409a);
                }
                int i = iM9409a;
                LevelPlayAdSize levelPlayAdSize = levelPlayAdSizeCreateCustomSize;
                IronLog.INTERNAL.info(C3240j1.m9406a(this.f7874a, "Adaptive: " + iM8260a + 'x' + i + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
                return new LevelPlayAdSize(iM8260a, i, C3395l.f9871f, true, levelPlayAdSize);
            }
            ironLog = IronLog.API;
            c3240j1 = this.f7874a;
            str = "Error getting max current orientation banner height";
        } else {
            ironLog = IronLog.API;
            c3240j1 = this.f7874a;
            str = "The SDK must be successfully initialized to create an Adaptive Ad Size";
        }
        ironLog.error(C3240j1.m9406a(c3240j1, str, (String) null, 2, (Object) null));
        return null;
    }

    /* renamed from: a */
    private final List<LevelPlayAdSize> m8261a() {
        return o00O0.OooOo00.Oooo0(this.f7874a.m9413b(), new c(new b()));
    }

    /* renamed from: a */
    private final List<LevelPlayAdSize> m8262a(List<LevelPlayAdSize> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
