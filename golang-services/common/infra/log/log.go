package log

import (
	"os"

	log "github.com/sirupsen/logrus"
)

var Logger = log.New()

func init() {
	Logger.SetFormatter(&log.JSONFormatter{})

	Logger.SetOutput(os.Stdout)
}