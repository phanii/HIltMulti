package com.ncr.dynamicfeature

import android.content.Context
import com.ncr.hiltmulti.DfmDependencies
import dagger.BindsInstance
import dagger.Component

@Component(dependencies = [DfmDependencies::class])
interface DfmComponent {

    fun inject(activity: DfmMainActivity)


    @Component.Builder
    interface Builder {

        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(dfmDependencies: DfmDependencies): Builder
        fun build(): DfmComponent
    }
}