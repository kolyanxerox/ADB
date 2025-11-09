package androidx.privacysandbox.ads.adservices.topics;

import OooO0oO.OooOo;

/* loaded from: classes.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return Integer.hashCode(this.topicId) + ((Long.hashCode(this.modelVersion) + (Long.hashCode(this.taxonomyVersion) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.taxonomyVersion);
        sb.append(", ModelVersion=");
        sb.append(this.modelVersion);
        sb.append(", TopicCode=");
        return OooOo.OooOO0("Topic { ", OooOo.OooOOO(sb, this.topicId, " }"));
    }
}
