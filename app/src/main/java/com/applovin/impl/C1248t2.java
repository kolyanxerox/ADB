package com.applovin.impl;

import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.applovin.impl.t2 */
/* loaded from: classes.dex */
public class C1248t2 {

    /* renamed from: a */
    private final C1065j4 f2375a = new C1065j4();

    /* renamed from: b */
    private final TreeSet f2376b = new TreeSet();

    /* renamed from: c */
    private final Map f2377c = new HashMap();

    /* renamed from: d */
    private int f2378d;

    /* renamed from: e */
    private int f2379e;

    public C1248t2(MaxAdPlacerSettings maxAdPlacerSettings) {
        m3297a(maxAdPlacerSettings);
    }

    /* renamed from: a */
    private void m3297a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C1240o.m3207h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f2375a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f2375a.isEmpty()) {
            this.f2375a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f2375a.m1055a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f2375a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f2375a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    /* renamed from: b */
    public Collection m3303b() {
        return new TreeSet((SortedSet) this.f2376b);
    }

    /* renamed from: c */
    public int m3305c() {
        int i = this.f2378d;
        if (i != -1 && this.f2379e != -1) {
            while (i <= this.f2379e) {
                if (m3311g(i) && !m3312h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public int m3308d(int i) {
        if (m3311g(i)) {
            return -1;
        }
        return i - m3295a(i, true);
    }

    /* renamed from: e */
    public Collection m3309e(int i) {
        return new TreeSet((SortedSet) this.f2376b.tailSet(Integer.valueOf(i), false));
    }

    /* renamed from: f */
    public void m3310f(int i) {
        int iM1059b = this.f2375a.m1059b(Integer.valueOf(i));
        for (int size = this.f2375a.size() - 1; size >= iM1059b; size--) {
            Integer num = (Integer) this.f2375a.m1056a(size);
            int iIntValue = num.intValue() + 1;
            m3296a(num.intValue(), iIntValue);
            this.f2375a.m1057a(size, Integer.valueOf(iIntValue));
        }
    }

    /* renamed from: g */
    public boolean m3311g(int i) {
        return this.f2375a.contains(Integer.valueOf(i));
    }

    /* renamed from: h */
    public boolean m3312h(int i) {
        return this.f2376b.contains(Integer.valueOf(i));
    }

    /* renamed from: i */
    public void m3313i(int i) {
        int iM1059b = this.f2375a.m1059b(Integer.valueOf(i));
        if (m3311g(i)) {
            this.f2377c.remove(Integer.valueOf(i));
            this.f2376b.remove(Integer.valueOf(i));
            this.f2375a.m1060b(iM1059b);
        }
        while (iM1059b < this.f2375a.size()) {
            Integer num = (Integer) this.f2375a.m1056a(iM1059b);
            int iIntValue = num.intValue() - 1;
            m3296a(num.intValue(), iIntValue);
            this.f2375a.m1057a(iM1059b, Integer.valueOf(iIntValue));
            iM1059b++;
        }
    }

    /* renamed from: b */
    public int m3302b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m3295a(i - 1, false);
    }

    /* renamed from: b */
    public void m3304b(int i, int i2) {
        m3313i(i);
        m3310f(i2);
    }

    /* renamed from: c */
    public void m3307c(int i, int i2) {
        this.f2378d = i;
        this.f2379e = i2;
    }

    /* renamed from: c */
    public int m3306c(int i) {
        return i + m3295a(i, false);
    }

    /* renamed from: a */
    public MaxAd m3298a(int i) {
        return (MaxAd) this.f2377c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m3300a(MaxAd maxAd, int i) {
        this.f2377c.put(Integer.valueOf(i), maxAd);
        this.f2376b.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m3299a() {
        this.f2377c.clear();
        this.f2376b.clear();
    }

    /* renamed from: a */
    public void m3301a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f2377c.remove(num);
            this.f2376b.remove(num);
        }
    }

    /* renamed from: a */
    private void m3296a(int i, int i2) {
        if (this.f2377c.containsKey(Integer.valueOf(i))) {
            this.f2377c.put(Integer.valueOf(i2), (MaxAd) this.f2377c.get(Integer.valueOf(i)));
            this.f2376b.add(Integer.valueOf(i2));
            this.f2377c.remove(Integer.valueOf(i));
            this.f2376b.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private int m3295a(int i, boolean z) {
        int iM1061c = this.f2375a.m1061c(Integer.valueOf(i));
        if (!z) {
            int i2 = i + iM1061c;
            while (iM1061c < this.f2375a.size() && i2 >= ((Integer) this.f2375a.m1056a(iM1061c)).intValue()) {
                i2++;
                iM1061c++;
            }
        }
        return iM1061c;
    }
}
