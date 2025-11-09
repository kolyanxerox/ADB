package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.BackEventCompat;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0Oo0oo;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0.o00O0O;

/* loaded from: classes.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    public static final class AnimationEffect extends SpecialEffectsController.Effect {
        private final AnimationInfo animationInfo;

        public AnimationEffect(AnimationInfo animationInfo) {
            OooOo.OooO0o0(animationInfo, "animationInfo");
            this.animationInfo = animationInfo;
        }

        public final AnimationInfo getAnimationInfo() {
            return this.animationInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            view.clearAnimation();
            container.endViewTransition(view);
            this.animationInfo.getOperation().completeEffect(this);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            if (this.animationInfo.isVisibilityUnchanged()) {
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            Context context = container.getContext();
            SpecialEffectsController.Operation operation = this.animationInfo.getOperation();
            View view = operation.getFragment().mView;
            AnimationInfo animationInfo = this.animationInfo;
            OooOo.OooO0Oo(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation2 = animation.animation;
            if (animation2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                view.startAnimation(animation2);
                this.animationInfo.getOperation().completeEffect(this);
                return;
            }
            container.startViewTransition(view);
            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view);
            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(operation, container, view, this));
            view.startAnimation(endViewTransitionAnimation);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has started.");
            }
        }
    }

    public static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, boolean z) {
            super(operation);
            OooOo.OooO0o0(operation, "operation");
            this.isPop = z;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            OooOo.OooO0o0(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static final class AnimatorEffect extends SpecialEffectsController.Effect {
        private AnimatorSet animator;
        private final AnimationInfo animatorInfo;

        public AnimatorEffect(AnimationInfo animatorInfo) {
            OooOo.OooO0o0(animatorInfo, "animatorInfo");
            this.animatorInfo = animatorInfo;
        }

        public final AnimatorSet getAnimator() {
            return this.animator;
        }

        public final AnimationInfo getAnimatorInfo() {
            return this.animatorInfo;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            return true;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            if (!operation.isSeeking()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                Api26Impl.INSTANCE.reverse(animatorSet);
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb = new StringBuilder("Animator from operation ");
                sb.append(operation);
                sb.append(" has been canceled");
                sb.append(operation.isSeeking() ? " with seeking." : ".");
                sb.append(' ');
                Log.v(FragmentManager.TAG, sb.toString());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            animatorSet.start();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            OooOo.OooO0o0(backEvent, "backEvent");
            OooOo.OooO0o0(container, "container");
            SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            AnimatorSet animatorSet = this.animator;
            if (animatorSet == null) {
                this.animatorInfo.getOperation().completeEffect(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !operation.getFragment().mTransitioning) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Adding BackProgressCallbacks for Animators to operation " + operation);
            }
            long j = Api24Impl.INSTANCE.totalDuration(animatorSet);
            long progress = (long) (backEvent.getProgress() * j);
            if (progress == 0) {
                progress = 1;
            }
            if (progress == j) {
                progress = j - 1;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Setting currentPlayTime to " + progress + " for Animator " + animatorSet + " on operation " + operation);
            }
            Api26Impl.INSTANCE.setCurrentPlayTime(animatorSet, progress);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(final ViewGroup container) {
            final AnimatorEffect animatorEffect;
            OooOo.OooO0o0(container, "container");
            if (this.animatorInfo.isVisibilityUnchanged()) {
                return;
            }
            Context context = container.getContext();
            AnimationInfo animationInfo = this.animatorInfo;
            OooOo.OooO0Oo(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            this.animator = animation != null ? animation.animator : null;
            final SpecialEffectsController.Operation operation = this.animatorInfo.getOperation();
            Fragment fragment = operation.getFragment();
            final boolean z = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
            final View view = fragment.mView;
            container.startViewTransition(view);
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorEffect = this;
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator anim) {
                        OooOo.OooO0o0(anim, "anim");
                        container.endViewTransition(view);
                        if (z) {
                            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                            View viewToAnimate = view;
                            OooOo.OooO0Oo(viewToAnimate, "viewToAnimate");
                            finalState.applyState(viewToAnimate, container);
                        }
                        animatorEffect.getAnimatorInfo().getOperation().completeEffect(animatorEffect);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                        }
                    }
                });
            } else {
                animatorEffect = this;
            }
            AnimatorSet animatorSet2 = animatorEffect.animator;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final void setAnimator(AnimatorSet animatorSet) {
            this.animator = animatorSet;
        }
    }

    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public final long totalDuration(AnimatorSet animatorSet) {
            OooOo.OooO0o0(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    public static final class Api26Impl {
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        public final void reverse(AnimatorSet animatorSet) {
            OooOo.OooO0o0(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void setCurrentPlayTime(AnimatorSet animatorSet, long j) {
            OooOo.OooO0o0(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j);
        }
    }

    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation) {
            OooOo.OooO0o0(operation, "operation");
            this.operation = operation;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final boolean isVisibilityUnchanged() {
            View view = this.operation.getFragment().mView;
            SpecialEffectsController.Operation.State stateAsOperationState = view != null ? SpecialEffectsController.Operation.State.Companion.asOperationState(view) : null;
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (stateAsOperationState == finalState) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateAsOperationState == state || finalState == state) ? false : true;
        }
    }

    public static final class TransitionEffect extends SpecialEffectsController.Effect {
        private Object controller;
        private final ArrayList<String> enteringNames;
        private final ArrayList<String> exitingNames;
        private final SpecialEffectsController.Operation firstOut;
        private final ArrayMap<String, View> firstOutViews;
        private final boolean isPop;
        private final SpecialEffectsController.Operation lastIn;
        private final ArrayMap<String, View> lastInViews;
        private final ArrayList<View> sharedElementFirstOutViews;
        private final ArrayList<View> sharedElementLastInViews;
        private final ArrayMap<String, String> sharedElementNameMapping;
        private final Object sharedElementTransition;
        private final FragmentTransitionImpl transitionImpl;
        private final List<TransitionInfo> transitionInfos;
        private final CancellationSignal transitionSignal;

        public TransitionEffect(List<TransitionInfo> transitionInfos, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, FragmentTransitionImpl transitionImpl, Object obj, ArrayList<View> sharedElementFirstOutViews, ArrayList<View> sharedElementLastInViews, ArrayMap<String, String> sharedElementNameMapping, ArrayList<String> enteringNames, ArrayList<String> exitingNames, ArrayMap<String, View> firstOutViews, ArrayMap<String, View> lastInViews, boolean z) {
            OooOo.OooO0o0(transitionInfos, "transitionInfos");
            OooOo.OooO0o0(transitionImpl, "transitionImpl");
            OooOo.OooO0o0(sharedElementFirstOutViews, "sharedElementFirstOutViews");
            OooOo.OooO0o0(sharedElementLastInViews, "sharedElementLastInViews");
            OooOo.OooO0o0(sharedElementNameMapping, "sharedElementNameMapping");
            OooOo.OooO0o0(enteringNames, "enteringNames");
            OooOo.OooO0o0(exitingNames, "exitingNames");
            OooOo.OooO0o0(firstOutViews, "firstOutViews");
            OooOo.OooO0o0(lastInViews, "lastInViews");
            this.transitionInfos = transitionInfos;
            this.firstOut = operation;
            this.lastIn = operation2;
            this.transitionImpl = transitionImpl;
            this.sharedElementTransition = obj;
            this.sharedElementFirstOutViews = sharedElementFirstOutViews;
            this.sharedElementLastInViews = sharedElementLastInViews;
            this.sharedElementNameMapping = sharedElementNameMapping;
            this.enteringNames = enteringNames;
            this.exitingNames = exitingNames;
            this.firstOutViews = firstOutViews;
            this.lastInViews = lastInViews;
            this.isPop = z;
            this.transitionSignal = new CancellationSignal();
        }

        private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    captureTransitioningViews(arrayList, childAt);
                }
            }
        }

        private final oo00o.OooOO0 createMergedTransition(ViewGroup viewGroup, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
            ViewGroup viewGroup2 = viewGroup;
            SpecialEffectsController.Operation operation3 = operation;
            View view = new View(viewGroup2.getContext());
            Rect rect = new Rect();
            Iterator<TransitionInfo> it = this.transitionInfos.iterator();
            boolean z = false;
            View view2 = null;
            while (it.hasNext()) {
                if (it.next().hasSharedElementTransition() && operation2 != null && operation3 != null && !this.sharedElementNameMapping.isEmpty() && this.sharedElementTransition != null) {
                    FragmentTransition.callSharedElementStartEnd(operation3.getFragment(), operation2.getFragment(), this.isPop, this.firstOutViews, true);
                    OneShotPreDrawListener.add(viewGroup2, new OooO00o(operation3, operation2, this, 1));
                    this.sharedElementFirstOutViews.addAll(this.firstOutViews.values());
                    if (!this.exitingNames.isEmpty()) {
                        String str = this.exitingNames.get(0);
                        OooOo.OooO0Oo(str, "exitingNames[0]");
                        view2 = this.firstOutViews.get(str);
                        this.transitionImpl.setEpicenter(this.sharedElementTransition, view2);
                    }
                    this.sharedElementLastInViews.addAll(this.lastInViews.values());
                    if (!this.enteringNames.isEmpty()) {
                        String str2 = this.enteringNames.get(0);
                        OooOo.OooO0Oo(str2, "enteringNames[0]");
                        View view3 = this.lastInViews.get(str2);
                        if (view3 != null) {
                            OneShotPreDrawListener.add(viewGroup2, new OooO00o(this.transitionImpl, view3, rect, 2));
                            z = true;
                        }
                    }
                    this.transitionImpl.setSharedElementTargets(this.sharedElementTransition, view, this.sharedElementFirstOutViews);
                    FragmentTransitionImpl fragmentTransitionImpl = this.transitionImpl;
                    Object obj = this.sharedElementTransition;
                    fragmentTransitionImpl.scheduleRemoveTargets(obj, null, null, null, null, obj, this.sharedElementLastInViews);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransitionInfo> it2 = this.transitionInfos.iterator();
            Object objMergeTransitionsTogether = null;
            Object objMergeTransitionsTogether2 = null;
            while (it2.hasNext()) {
                TransitionInfo next = it2.next();
                SpecialEffectsController.Operation operation4 = next.getOperation();
                boolean z2 = z;
                Object objCloneTransition = this.transitionImpl.cloneTransition(next.getTransition());
                if (objCloneTransition != null) {
                    ArrayList<View> arrayList2 = new ArrayList<>();
                    Iterator<TransitionInfo> it3 = it2;
                    View view4 = operation4.getFragment().mView;
                    OooOo.OooO0Oo(view4, "operation.fragment.mView");
                    captureTransitioningViews(arrayList2, view4);
                    if (this.sharedElementTransition != null && (operation4 == operation2 || operation4 == operation3)) {
                        if (operation4 == operation2) {
                            arrayList2.removeAll(OooOo00.Oooo0oo(this.sharedElementFirstOutViews));
                        } else {
                            arrayList2.removeAll(OooOo00.Oooo0oo(this.sharedElementLastInViews));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.transitionImpl.addTarget(objCloneTransition, view);
                    } else {
                        this.transitionImpl.addTargets(objCloneTransition, arrayList2);
                        this.transitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList2, null, null, null, null);
                        if (operation4.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4.setAwaitingContainerChanges(false);
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(operation4.getFragment().mView);
                            this.transitionImpl.scheduleHideFragmentView(objCloneTransition, operation4.getFragment().mView, arrayList3);
                            OneShotPreDrawListener.add(viewGroup2, new OooO0O0(arrayList2, 0));
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z2) {
                            this.transitionImpl.setEpicenter(objCloneTransition, rect);
                        }
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Entering Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> EnteringViews <<<<<");
                            int i = 0;
                            for (int size = arrayList2.size(); i < size; size = size) {
                                View transitioningViews = arrayList2.get(i);
                                i++;
                                OooOo.OooO0Oo(transitioningViews, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews);
                            }
                        }
                    } else {
                        this.transitionImpl.setEpicenter(objCloneTransition, view2);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Exiting Transition: " + objCloneTransition);
                            Log.v(FragmentManager.TAG, ">>>>> ExitingViews <<<<<");
                            int i2 = 0;
                            for (int size2 = arrayList2.size(); i2 < size2; size2 = size2) {
                                View transitioningViews2 = arrayList2.get(i2);
                                i2++;
                                OooOo.OooO0Oo(transitioningViews2, "transitioningViews");
                                Log.v(FragmentManager.TAG, "View: " + transitioningViews2);
                            }
                        }
                    }
                    if (next.isOverlapAllowed()) {
                        objMergeTransitionsTogether = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                    } else {
                        objMergeTransitionsTogether2 = this.transitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                    }
                    viewGroup2 = viewGroup;
                    operation3 = operation;
                    z = z2;
                    it2 = it3;
                } else {
                    viewGroup2 = viewGroup;
                    operation3 = operation;
                    z = z2;
                }
            }
            Object objMergeTransitionsInSequence = this.transitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether, objMergeTransitionsTogether2, this.sharedElementTransition);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Final merged transition: " + objMergeTransitionsInSequence);
            }
            return new oo00o.OooOO0(arrayList, objMergeTransitionsInSequence);
        }

        public static final void createMergedTransition$lambda$12(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, TransitionEffect this$0) {
            OooOo.OooO0o0(this$0, "this$0");
            FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), this$0.isPop, this$0.lastInViews, false);
        }

        public static final void createMergedTransition$lambda$13(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
            OooOo.OooO0o0(impl, "$impl");
            OooOo.OooO0o0(lastInEpicenterRect, "$lastInEpicenterRect");
            impl.getBoundsOnScreen(view, lastInEpicenterRect);
        }

        public static final void createMergedTransition$lambda$14(ArrayList transitioningViews) {
            OooOo.OooO0o0(transitioningViews, "$transitioningViews");
            FragmentTransition.setViewVisibility(transitioningViews, 4);
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
        }

        public static final void onCommit$lambda$11$lambda$10(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            OooOo.OooO0o0(operation, "$operation");
            OooOo.OooO0o0(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        public static final void onStart$lambda$6$lambda$4(o0Oo0oo seekCancelLambda) {
            OooOo.OooO0o0(seekCancelLambda, "$seekCancelLambda");
            o00O0Oo.OooO0O0 oooO0O0 = (o00O0Oo.OooO0O0) seekCancelLambda.f28880OooOo0O;
            if (oooO0O0 != null) {
                oooO0O0.invoke();
            }
        }

        public static final void onStart$lambda$6$lambda$5(SpecialEffectsController.Operation operation, TransitionEffect this$0) {
            OooOo.OooO0o0(operation, "$operation");
            OooOo.OooO0o0(this$0, "this$0");
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
            }
            operation.completeEffect(this$0);
        }

        private final void runTransition(ArrayList<View> arrayList, ViewGroup viewGroup, o00O0Oo.OooO0O0 oooO0O0) {
            FragmentTransition.setViewVisibility(arrayList, 4);
            ArrayList<String> arrayListPrepareSetNameOverridesReordered = this.transitionImpl.prepareSetNameOverridesReordered(this.sharedElementLastInViews);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, ">>>>> Beginning transition <<<<<");
                Log.v(FragmentManager.TAG, ">>>>> SharedElementFirstOutViews <<<<<");
                ArrayList<View> arrayList2 = this.sharedElementFirstOutViews;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    View sharedElementFirstOutViews = arrayList2.get(i);
                    i++;
                    OooOo.OooO0Oo(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                    View view = sharedElementFirstOutViews;
                    Log.v(FragmentManager.TAG, "View: " + view + " Name: " + ViewCompat.getTransitionName(view));
                }
                Log.v(FragmentManager.TAG, ">>>>> SharedElementLastInViews <<<<<");
                ArrayList<View> arrayList3 = this.sharedElementLastInViews;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    View sharedElementLastInViews = arrayList3.get(i2);
                    i2++;
                    OooOo.OooO0Oo(sharedElementLastInViews, "sharedElementLastInViews");
                    View view2 = sharedElementLastInViews;
                    Log.v(FragmentManager.TAG, "View: " + view2 + " Name: " + ViewCompat.getTransitionName(view2));
                }
            }
            oooO0O0.invoke();
            this.transitionImpl.setNameOverridesReordered(viewGroup, this.sharedElementFirstOutViews, this.sharedElementLastInViews, arrayListPrepareSetNameOverridesReordered, this.sharedElementNameMapping);
            FragmentTransition.setViewVisibility(arrayList, 0);
            this.transitionImpl.swapSharedElementTargets(this.sharedElementTransition, this.sharedElementFirstOutViews, this.sharedElementLastInViews);
        }

        public final Object getController() {
            return this.controller;
        }

        public final ArrayList<String> getEnteringNames() {
            return this.enteringNames;
        }

        public final ArrayList<String> getExitingNames() {
            return this.exitingNames;
        }

        public final SpecialEffectsController.Operation getFirstOut() {
            return this.firstOut;
        }

        public final ArrayMap<String, View> getFirstOutViews() {
            return this.firstOutViews;
        }

        public final SpecialEffectsController.Operation getLastIn() {
            return this.lastIn;
        }

        public final ArrayMap<String, View> getLastInViews() {
            return this.lastInViews;
        }

        public final ArrayList<View> getSharedElementFirstOutViews() {
            return this.sharedElementFirstOutViews;
        }

        public final ArrayList<View> getSharedElementLastInViews() {
            return this.sharedElementLastInViews;
        }

        public final ArrayMap<String, String> getSharedElementNameMapping() {
            return this.sharedElementNameMapping;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final FragmentTransitionImpl getTransitionImpl() {
            return this.transitionImpl;
        }

        public final List<TransitionInfo> getTransitionInfos() {
            return this.transitionInfos;
        }

        public final CancellationSignal getTransitionSignal() {
            return this.transitionSignal;
        }

        public final boolean getTransitioning() {
            List<TransitionInfo> list = this.transitionInfos;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((TransitionInfo) it.next()).getOperation().getFragment().mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isPop() {
            return this.isPop;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
            if (!this.transitionImpl.isSeekingSupported()) {
                return false;
            }
            List<TransitionInfo> list = this.transitionInfos;
            if (list == null || !list.isEmpty()) {
                for (TransitionInfo transitionInfo : list) {
                    if (Build.VERSION.SDK_INT < 34 || transitionInfo.getTransition() == null || !this.transitionImpl.isSeekingSupported(transitionInfo.getTransition())) {
                        return false;
                    }
                }
            }
            Object obj = this.sharedElementTransition;
            return obj == null || this.transitionImpl.isSeekingSupported(obj);
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            this.transitionSignal.cancel();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(ViewGroup container) {
            Object obj;
            OooOo.OooO0o0(container, "container");
            int i = 2;
            if (!container.isLaidOut()) {
                for (TransitionInfo transitionInfo : this.transitionInfos) {
                    SpecialEffectsController.Operation operation = transitionInfo.getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + operation);
                    }
                    transitionInfo.getOperation().completeEffect(this);
                }
                return;
            }
            Object obj2 = this.controller;
            if (obj2 != null) {
                this.transitionImpl.animateToEnd(obj2);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ending execution of operations from " + this.firstOut + " to " + this.lastIn);
                    return;
                }
                return;
            }
            oo00o.OooOO0 oooOO0CreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayList = (ArrayList) oooOO0CreateMergedTransition.f33185OooOo0O;
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList arrayList2 = new ArrayList(Oooo000.OooOo0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TransitionInfo) it.next()).getOperation());
            }
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                obj = oooOO0CreateMergedTransition.f33186OooOo0o;
                if (i2 >= size) {
                    break;
                }
                Object obj3 = arrayList2.get(i2);
                i2++;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj3;
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), obj, this.transitionSignal, new OooO0OO(operation2, this, 1));
                i = i;
            }
            runTransition(arrayList, container, new DefaultSpecialEffectsController$TransitionEffect$onCommit$4(this, container, obj));
            if (FragmentManager.isLoggingEnabled(i)) {
                Log.v(FragmentManager.TAG, "Completed executing operations from " + this.firstOut + " to " + this.lastIn);
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(BackEventCompat backEvent, ViewGroup container) {
            OooOo.OooO0o0(backEvent, "backEvent");
            OooOo.OooO0o0(container, "container");
            Object obj = this.controller;
            if (obj != null) {
                this.transitionImpl.setCurrentPlayTime(obj, backEvent.getProgress());
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(ViewGroup container) {
            OooOo.OooO0o0(container, "container");
            if (!container.isLaidOut()) {
                Iterator<T> it = this.transitionInfos.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((TransitionInfo) it.next()).getOperation();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + operation);
                    }
                }
                return;
            }
            if (getTransitioning() && this.sharedElementTransition != null && !isSeekingSupported()) {
                Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + this.sharedElementTransition + " between " + this.firstOut + " and " + this.lastIn + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (!isSeekingSupported() || !getTransitioning()) {
                return;
            }
            o0Oo0oo o0oo0oo = new o0Oo0oo();
            oo00o.OooOO0 oooOO0CreateMergedTransition = createMergedTransition(container, this.lastIn, this.firstOut);
            ArrayList<View> arrayList = (ArrayList) oooOO0CreateMergedTransition.f33185OooOo0O;
            List<TransitionInfo> list = this.transitionInfos;
            ArrayList arrayList2 = new ArrayList(Oooo000.OooOo0(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((TransitionInfo) it2.next()).getOperation());
            }
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                Object obj = oooOO0CreateMergedTransition.f33186OooOo0o;
                if (i >= size) {
                    runTransition(arrayList, container, new DefaultSpecialEffectsController$TransitionEffect$onStart$4(this, container, obj, o0oo0oo));
                    return;
                }
                Object obj2 = arrayList2.get(i);
                i++;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj2;
                this.transitionImpl.setListenerForTransitionEnd(operation2.getFragment(), obj, this.transitionSignal, new OooO0O0(o0oo0oo, 1), new OooO0OO(operation2, this, 0));
            }
        }

        public final void setController(Object obj) {
            this.controller = obj;
        }
    }

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1 */
    public static final class C04771 extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.Oooo000 {
        final /* synthetic */ Collection<String> $names;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04771(Collection<String> collection) {
            super(1);
            this.$names = collection;
        }

        @Override // o00O0Oo.Oooo000
        public final Boolean invoke(Map.Entry<String, View> entry) {
            OooOo.OooO0o0(entry, "entry");
            return Boolean.valueOf(OooOo00.OooOoO0(this.$names, ViewCompat.getTransitionName(entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        OooOo.OooO0o0(container, "container");
    }

    private final void collectAnimEffects(List<AnimationInfo> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            o00O0O.OooOo0o(((AnimationInfo) it.next()).getOperation().getEffects$fragment_release(), arrayList2);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        int i = 0;
        boolean z = false;
        for (AnimationInfo animationInfo : list) {
            Context context = getContainer().getContext();
            SpecialEffectsController.Operation operation = animationInfo.getOperation();
            OooOo.OooO0Oo(context, "context");
            FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
            if (animation != null) {
                if (animation.animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    Fragment fragment = operation.getFragment();
                    if (operation.getEffects$fragment_release().isEmpty()) {
                        if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation.setAwaitingContainerChanges(false);
                        }
                        operation.addEffect(new AnimatorEffect(animationInfo));
                        z = true;
                    } else if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AnimationInfo animationInfo2 = (AnimationInfo) obj;
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (zIsEmpty) {
                if (!z) {
                    operation2.addEffect(new AnimationEffect(animationInfo2));
                } else if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
            } else if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public static final void collectEffects$lambda$2(DefaultSpecialEffectsController this$0, SpecialEffectsController.Operation operation) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(operation, "$operation");
        this$0.applyContainerChangesToOperation$fragment_release(operation);
    }

    private final void createTransitionEffect(List<TransitionInfo> list, boolean z, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        FragmentTransitionImpl fragmentTransitionImpl;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        int i2;
        Object obj;
        String strFindKeyForValue;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list) {
            if (!((TransitionInfo) obj2).isVisibilityUnchanged()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            if (((TransitionInfo) obj3).getHandlingImpl() != null) {
                arrayList6.add(obj3);
            }
        }
        int size2 = arrayList6.size();
        FragmentTransitionImpl fragmentTransitionImpl2 = null;
        Object obj4 = null;
        int i4 = 0;
        while (i4 < size2) {
            Object obj5 = arrayList6.get(i4);
            i4++;
            TransitionInfo transitionInfo = (TransitionInfo) obj5;
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        ArrayList<String> arrayList9 = new ArrayList<>();
        ArrayList<String> arrayList10 = new ArrayList<>();
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
        int size3 = arrayList6.size();
        ArrayList<String> sharedElementTargetNames = arrayList9;
        ArrayList<String> sharedElementSourceNames = arrayList10;
        int i5 = 0;
        while (i5 < size3) {
            Object obj6 = arrayList6.get(i5);
            int i6 = i5 + 1;
            TransitionInfo transitionInfo2 = (TransitionInfo) obj6;
            if (!transitionInfo2.hasSharedElementTransition() || operation == null || operation2 == null) {
                arrayList2 = arrayList6;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                i = size3;
                i2 = i6;
                fragmentTransitionImpl2 = fragmentTransitionImpl;
                arrayList7 = arrayList3;
                arrayList8 = arrayList4;
                size3 = i;
                i5 = i2;
                arrayList6 = arrayList2;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo2.getSharedElementTransition()));
                sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                OooOo.OooO0Oo(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                OooOo.OooO0Oo(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames2 = operation.getFragment().getSharedElementTargetNames();
                fragmentTransitionImpl = fragmentTransitionImpl2;
                OooOo.OooO0Oo(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                int size4 = sharedElementTargetNames2.size();
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                int i7 = 0;
                while (i7 < size4) {
                    int i8 = size4;
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i7));
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i7));
                    }
                    i7++;
                    size4 = i8;
                }
                sharedElementTargetNames = operation2.getFragment().getSharedElementTargetNames();
                OooOo.OooO0Oo(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                oo00o.OooOO0 oooOO0 = !z ? new oo00o.OooOO0(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : new oo00o.OooOO0(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                SharedElementCallback sharedElementCallback = (SharedElementCallback) oooOO0.f33185OooOo0O;
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) oooOO0.f33186OooOo0o;
                int size5 = sharedElementSourceNames.size();
                i = size3;
                int i9 = 0;
                while (true) {
                    i2 = i6;
                    if (i9 >= size5) {
                        break;
                    }
                    int i10 = size5;
                    String str = sharedElementSourceNames.get(i9);
                    OooOo.OooO0Oo(str, "exitingNames[i]");
                    String str2 = sharedElementTargetNames.get(i9);
                    OooOo.OooO0Oo(str2, "enteringNames[i]");
                    arrayMap.put(str, str2);
                    i9++;
                    i6 = i2;
                    size5 = i10;
                }
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    int size6 = sharedElementTargetNames.size();
                    arrayList2 = arrayList6;
                    obj = objWrapTransitionInSet;
                    int i11 = 0;
                    while (i11 < size6) {
                        String str3 = sharedElementTargetNames.get(i11);
                        int i12 = i11 + 1;
                        String str4 = str3;
                        Log.v(FragmentManager.TAG, "Name: " + str4);
                        size6 = size6;
                        i11 = i12;
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    int i13 = 0;
                    for (int size7 = sharedElementSourceNames.size(); i13 < size7; size7 = size7) {
                        String str5 = sharedElementSourceNames.get(i13);
                        Log.v(FragmentManager.TAG, "Name: " + str5);
                        i13++;
                    }
                } else {
                    arrayList2 = arrayList6;
                    obj = objWrapTransitionInSet;
                }
                View view = operation.getFragment().mView;
                OooOo.OooO0Oo(view, "firstOut.fragment.mView");
                findNamedViews(arrayMap2, view);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size8 = sharedElementSourceNames.size() - 1;
                    if (size8 >= 0) {
                        while (true) {
                            int i14 = size8 - 1;
                            String str6 = sharedElementSourceNames.get(size8);
                            OooOo.OooO0Oo(str6, "exitingNames[i]");
                            String str7 = str6;
                            View view2 = arrayMap2.get(str7);
                            if (view2 == null) {
                                arrayMap.remove(str7);
                            } else if (!str7.equals(ViewCompat.getTransitionName(view2))) {
                                arrayMap.put(ViewCompat.getTransitionName(view2), (String) arrayMap.remove(str7));
                            }
                            if (i14 < 0) {
                                break;
                            } else {
                                size8 = i14;
                            }
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                View view3 = operation2.getFragment().mView;
                OooOo.OooO0Oo(view3, "lastIn.fragment.mView");
                findNamedViews(arrayMap3, view3);
                arrayMap3.retainAll(sharedElementTargetNames);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, arrayMap3);
                    int size9 = sharedElementTargetNames.size() - 1;
                    if (size9 >= 0) {
                        while (true) {
                            int i15 = size9 - 1;
                            String str8 = sharedElementTargetNames.get(size9);
                            OooOo.OooO0Oo(str8, "enteringNames[i]");
                            String str9 = str8;
                            View view4 = arrayMap3.get(str9);
                            if (view4 == null) {
                                String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str9);
                                if (strFindKeyForValue2 != null) {
                                    arrayMap.remove(strFindKeyForValue2);
                                }
                            } else if (!str9.equals(ViewCompat.getTransitionName(view4)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str9)) != null) {
                                arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view4));
                            }
                            if (i15 < 0) {
                                break;
                            } else {
                                size9 = i15;
                            }
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> collectionKeySet = arrayMap.keySet();
                OooOo.OooO0Oo(collectionKeySet, "sharedElementNameMapping.keys");
                retainMatchingViews(arrayMap2, collectionKeySet);
                Collection<String> collectionValues = arrayMap.values();
                OooOo.OooO0Oo(collectionValues, "sharedElementNameMapping.values");
                retainMatchingViews(arrayMap3, collectionValues);
                if (arrayMap.isEmpty()) {
                    Log.i(FragmentManager.TAG, "Ignoring shared elements transition " + obj + " between " + operation + " and " + operation2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                    arrayList3.clear();
                    arrayList4.clear();
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                    size3 = i;
                    i5 = i2;
                    arrayList6 = arrayList2;
                    obj4 = null;
                } else {
                    obj4 = obj;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                    size3 = i;
                    i5 = i2;
                    arrayList6 = arrayList2;
                }
            }
        }
        ArrayList arrayList11 = arrayList6;
        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        ArrayList arrayList12 = arrayList7;
        ArrayList arrayList13 = arrayList8;
        if (obj4 == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            int size10 = arrayList11.size();
            int i16 = 0;
            while (i16 < size10) {
                arrayList = arrayList11;
                Object obj7 = arrayList.get(i16);
                i16++;
                if (((TransitionInfo) obj7).getTransition() == null) {
                    arrayList11 = arrayList;
                }
            }
            return;
        }
        arrayList = arrayList11;
        ArrayList arrayList14 = arrayList;
        TransitionEffect transitionEffect = new TransitionEffect(arrayList14, operation, operation2, fragmentTransitionImpl3, obj4, arrayList12, arrayList13, arrayMap, sharedElementTargetNames, sharedElementSourceNames, arrayMap2, arrayMap3, z);
        int size11 = arrayList14.size();
        int i17 = 0;
        while (i17 < size11) {
            Object obj8 = arrayList14.get(i17);
            i17++;
            ((TransitionInfo) obj8).getOperation().addEffect(transitionEffect);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        OooOo.OooO0Oo(entries, "entries");
        C04771 c04771 = new C04771(collection);
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            if (!((Boolean) c04771.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) OooOo00.Oooo000(list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00b6  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void collectEffects(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            kotlin.jvm.internal.OooOo.OooO0o0(r9, r0)
            java.util.Iterator r0 = r9.iterator()
        L9:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            r4 = r1
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            android.view.View r6 = r6.mView
            kotlin.jvm.internal.OooOo.OooO0Oo(r6, r3)
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.asOperationState(r6)
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r5 != r6) goto L9
            androidx.fragment.app.SpecialEffectsController$Operation$State r4 = r4.getFinalState()
            if (r4 == r6) goto L9
            goto L34
        L33:
            r1 = r2
        L34:
            androidx.fragment.app.SpecialEffectsController$Operation r1 = (androidx.fragment.app.SpecialEffectsController.Operation) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L3e:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r0.previous()
            r5 = r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            androidx.fragment.app.Fragment r7 = r5.getFragment()
            android.view.View r7 = r7.mView
            kotlin.jvm.internal.OooOo.OooO0Oo(r7, r3)
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r6.asOperationState(r7)
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r6 == r7) goto L3e
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.getFinalState()
            if (r5 != r7) goto L3e
            r2 = r4
        L65:
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Executing operations from "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L89:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.syncAnimations(r9)
            java.util.Iterator r9 = r9.iterator()
        L9a:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r9.next()
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r5.<init>(r4, r10)
            r0.add(r5)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            r6 = 0
            r7 = 1
            if (r10 == 0) goto Lb8
            if (r4 != r1) goto Lbb
        Lb6:
            r6 = r7
            goto Lbb
        Lb8:
            if (r4 != r2) goto Lbb
            goto Lb6
        Lbb:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            androidx.fragment.app.OooO0o r5 = new androidx.fragment.app.OooO0o
            r6 = 1
            r5.<init>(r6, r8, r4)
            r4.addCompletionListener(r5)
            goto L9a
        Lcb:
            r8.createTransitionEffect(r3, r10, r1, r2)
            r8.collectAnimEffects(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.collectEffects(java.util.List, boolean):void");
    }

    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, boolean z, boolean z2) {
            Object returnTransition;
            super(operation);
            OooOo.OooO0o0(operation, "operation");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                returnTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            this.isOverlapAllowed = operation.getFinalState() == state ? z ? operation.getFragment().getAllowReturnTransitionOverlap() : operation.getFragment().getAllowEnterTransitionOverlap() : true;
            this.sharedElementTransition = z2 ? z ? operation.getFragment().getSharedElementReturnTransition() : operation.getFragment().getSharedElementEnterTransition() : null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
