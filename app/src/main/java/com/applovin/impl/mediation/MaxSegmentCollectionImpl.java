package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {

    /* renamed from: a */
    private final List f1249a;

    /* renamed from: b */
    private final Map f1250b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a */
        private final List f1251a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f1251a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public /* synthetic */ MaxSegmentCollectionImpl(BuilderImpl builderImpl, C1102a c1102a) {
        this(builderImpl);
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f1250b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f1249a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f1249a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f1251a;
        this.f1249a = list;
        this.f1250b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f1250b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
