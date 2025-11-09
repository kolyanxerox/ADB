package org.apache.tika.sax.xpath;

/* loaded from: classes3.dex */
public class CompositeMatcher extends Matcher {

    /* renamed from: a */
    private final Matcher f13241a;

    /* renamed from: b */
    private final Matcher f13242b;

    public CompositeMatcher(Matcher matcher, Matcher matcher2) {
        this.f13241a = matcher;
        this.f13242b = matcher2;
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public Matcher descend(String str, String str2) {
        Matcher matcherDescend = this.f13241a.descend(str, str2);
        Matcher matcherDescend2 = this.f13242b.descend(str, str2);
        Matcher matcher = Matcher.FAIL;
        return matcherDescend == matcher ? matcherDescend2 : matcherDescend2 == matcher ? matcherDescend : (this.f13241a == matcherDescend && this.f13242b == matcherDescend2) ? this : new CompositeMatcher(matcherDescend, matcherDescend2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesAttribute(String str, String str2) {
        return this.f13241a.matchesAttribute(str, str2) || this.f13242b.matchesAttribute(str, str2);
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesElement() {
        return this.f13241a.matchesElement() || this.f13242b.matchesElement();
    }

    @Override // org.apache.tika.sax.xpath.Matcher
    public boolean matchesText() {
        return this.f13241a.matchesText() || this.f13242b.matchesText();
    }
}
