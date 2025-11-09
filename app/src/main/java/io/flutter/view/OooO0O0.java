package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Predicate {
    @Override // io.flutter.util.Predicate
    public final boolean test(Object obj) {
        return AccessibilityBridge.lambda$shouldSetCollectionInfo$1((AccessibilityBridge.SemanticsNode) obj);
    }
}
