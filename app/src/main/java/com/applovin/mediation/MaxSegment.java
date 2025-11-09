package com.applovin.mediation;

import com.applovin.impl.sdk.C1240o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxSegment {

    /* renamed from: a */
    private final int f3261a;

    /* renamed from: b */
    private final List f3262b;

    public MaxSegment(int i, List<Integer> list) {
        this.f3261a = i;
        this.f3262b = list;
        m3904a(i);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            m3904a(it.next().intValue());
        }
    }

    /* renamed from: a */
    private void m3904a(int i) {
        if (i >= 0) {
            return;
        }
        C1240o.m3207h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f3261a;
    }

    public List<Integer> getValues() {
        return this.f3262b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f3261a + ", values=" + this.f3262b + '}';
    }
}
