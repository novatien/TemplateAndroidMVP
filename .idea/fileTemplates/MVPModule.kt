#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME} #end

import dagger.Binds
import dagger.Module

#parse("File Header.java")
@Module(includes = [${Name_Base}Module.${Name_Base}AbstractModule::class])
class ${Name_Base}Module {
    @Module
    interface ${Name_Base}AbstractModule {
        @ActivityScoped
        @Binds
       #if($Is_Activity == true)
        fun bind${Name_Base}View (activity: ${Name_Base}Activity): ${Name_Base}View
       #else
        fun bind${Name_Base}View (fragment: ${Name_Base}Fragment): ${Name_Base}View
       #end

        @ActivityScoped
        @Binds
        fun bind${Name_Base}Presenter(presenter: ${Name_Base}PresenterImpl): ${Name_Base}Presenter

        @ActivityScoped
        @Binds
        fun bind${Name_Base}Navigator(navigator: ${Name_Base}NavigatorImpl): ${Name_Base}Navigator
    }
}