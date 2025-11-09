package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15241OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Predicate f15242OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f15243OooO0OO;

    public /* synthetic */ OooO00o(Predicate predicate, Predicate predicate2, int i) {
        this.f15241OooO00o = i;
        this.f15242OooO0O0 = predicate;
        this.f15243OooO0OO = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f15241OooO00o) {
            case 0:
                return this.f15242OooO0O0.lambda$or$2((Predicate) this.f15243OooO0OO, obj);
            case 1:
                return this.f15242OooO0O0.lambda$and$0((Predicate) this.f15243OooO0OO, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f15243OooO0OO, this.f15242OooO0O0, obj);
        }
    }

    public /* synthetic */ OooO00o(Class cls, Predicate predicate) {
        this.f15241OooO00o = 2;
        this.f15243OooO0OO = cls;
        this.f15242OooO0O0 = predicate;
    }
}
