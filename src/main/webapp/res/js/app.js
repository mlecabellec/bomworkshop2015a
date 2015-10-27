/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Require JST, lodash and JQuery


this["APP"] = this["APP"] || {
    moduleInfo:
            {
                moduleId: "APP",
                moduleVersion: "0.0.1-DEV",
                description: "Root of the APP tree"
            },
    loadedModules: [],
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.moduleInfo);
    }
};
APP.bootstrap();

//------------------------------------------------------------------------------

this.APP["login"] = this.APP["login"] || {
    moduleInfo:
            {
                moduleId: "APP.Login",
                moduleVersion: "0.0.1-DEV",
                description: "Login related module"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.login.moduleInfo);
    },
    gui: {},
    data: {},
    tickets: []
};
APP.login.bootstrap();

//------------------------------------------------------------------------------

this.APP["views"] = this.APP["views"] || {
    moduleInfo:
            {
                moduleId: "APP.views",
                moduleVersion: "0.0.1-DEV",
                description: "View related functions including init routines"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.views.moduleInfo);
    }
};
APP.views.bootstrap();

//------------------------------------------------------------------------------

this.APP["debug"] = this.APP["debug"] || {
    moduleInfo:
            {
                moduleId: "APP.debug",
                moduleVersion: "0.0.1-DEV",
                description: "Debug related functions"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.debug.moduleInfo);
        if (APP.debug.enabled)
        {
            APP.debug.debugKit.init();
        }
    },
    enabled: true,
    debugKit: {
        init: function initDebugKit()
        {

        }
    }
};
APP.debug.bootstrap();

//------------------------------------------------------------------------------

this.APP["logs"] = this.APP["logs"] || {
    moduleInfo:
            {
                moduleId: "APP.logs",
                moduleVersion: "0.0.1-DEV",
                description: "Log related functions"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.logs.moduleInfo);
    }
};
APP.logs.bootstrap();

//------------------------------------------------------------------------------

this.APP["home"] = this.APP["home"] || {
    moduleInfo:
            {
                moduleId: "APP.home",
                moduleVersion: "0.0.1-DEV",
                description: "Home functions including init routines"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.home.moduleInfo);
    },
    gui: {
        init: function init() {

            $("#globalDashboardLink").unbind("click");
            $("#globalDashboardLink").on("click", APP.home.gui.setupGeneralDashBoard);

            $("#changeAndImpactsLink").unbind("click");
            $("#changeAndImpactsLink").on("click", APP.home.gui.setupChangeAndImpactsWorkshop);

            $("#BomSearchAndSelectLink").unbind("click");
            $("#BomSearchAndSelectLink").on("click", APP.home.gui.setupSearchAndSelectWorkshop);

            $("#sideBySideBuildingLink").unbind("click");
            $("#sideBySideBuildingLink").on("click", APP.home.gui.setupSideBySideWorkshop);

            //$("#changeAndImpactsLink").unbind("click");
            //$("#changeAndImpactsLink").on("click", APP.home.gui.setupChangeAndImpactsWorkshop);


        },
        setupGeneralDashBoard: function setupGeneralDashBoard(event) {
            window.alert("setupGeneralDashBoard not implemented !!!");
        },
        setupChangeAndImpactsWorkshop: function setupChangeAndImpactsWorkshop(event) {
            window.alert("setupChangeAndImpactsWorkshop not implemented !!!");
        },
        setupSearchAndSelectWorkshop: function setupSearchAndSelectWorkshop(event) {
            window.alert("setupSearchAndSelectWorkshop not implemented !!!");
        },
        setupSideBySideWorkshop: function setupSideBySideWorkshop(event) {
            window.alert("setupSideBySideWorkshop not implemented !!!");
        }
    },
    toolKit: {},
    data: {}
};
APP.home.bootstrap();


//------------------------------------------------------------------------------

this.APP["bomGeneralDashboard"] = this.APP["home"] || {
    moduleInfo:
            {
                moduleId: "APP.bomGeneralDashboard",
                moduleVersion: "0.0.1-DEV",
                description: "BOM general dashboard"
            },
    bootstrap: function bootstrap() {
        APP.loadedModules = APP.loadedModules.concat(APP.bomGeneralDashboard.moduleInfo);
    },
    gui: {
        init: function init() {

         
         

        }
    },
    toolKit: {},
    data: {}
};
APP.bomGeneralDashboard.bootstrap();




